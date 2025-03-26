//inheritance - java classes have a parent-child
//(superclass/subclass) relationship
//-the child class/subclass extends the parent/super class
//-the child class inherits (has access to) all public
//functionalities of the parent class (methods and any public vars)

//classes with an inheritance structure have an IS-A relationship
//ex: a Goat IS A(n) Animal

public class Goat extends Animal {
    private boolean haveHorns;

    public Goat(String name, boolean h) {

        //since a Goat IS An Animal, the first line in the
        //child class constructor needs to call the parent
        //class constructor using the keyword super()
        super(name);
        //make sure the args for the parent constructor match
        //how that constructor was defined

        haveHorns = h;
    }

    public void attack(){
        if (haveHorns)
            //even though name is an instance variable in the parent
            //class, it's private so you have to access it through
            //the public get method
            System.out.println( getName() + " attacked the rock");
        else
            System.out.println( getName() + " ran into a rock");
    }

    //when goats sleep, they double their energy

    //method overriding - redefine a parent class method
    //in a child class

    public void sleep() {
        //energy var is private in Animal
        //energy = energy * 2;

        setEnergy( getEnergy() * 2 );
        System.out.println(getName() + " the goat took a goat nap and has " + getEnergy() + " energy");
    }

    public String toString() {

        //when you want to call the parent class version of a method
        //AND you've overridden it in the child class, use "super." notation
        //to refer to the parent class's version of the method
        return super.toString() + " and is a goat. horns = " + haveHorns;
    }

    //two Goat objects are equal if they have the same name, energy, horns
    public boolean equals(Object o) {
        if (o instanceof Goat) {
            Goat other = (Goat) o;
            //since the Animal class equals() already checks name and energy,
            //can access it by using super.equals()
            if (super.equals(o) && other.haveHorns == this.haveHorns) {
                return true;
            }
        }
        return false;
    }

}
