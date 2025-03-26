public class Animal {

    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        energy = 23;
    }

    public String getName() { return name;}
    public int getEnergy() { return energy; }

    public void setEnergy(int newEnergy) { energy = newEnergy; };

    public void eat() {
        energy += 5;
        System.out.println(name + " ate a snack and has " + energy + " energy");
    }

    public void sleep(){
        energy += 20;
        System.out.println(name + " took a nap and has " + energy + " energy");
    }

    public void run() {
        energy -= 15;
        System.out.println(name + " went for a run and has " + energy + " energy");
    }

    //the Java Object class is a parent to ALL classes we write
    //-the Object class defines toString(), which returns the mem location,
    //which is why toString() is still usable even when we don't
    //define it in a class
    //-by overriding toString(), we redefine what information gets
    //returned instead of the predefined mem loc
    public String toString() {
        return name + " has " + energy + " energy";
    }

    //the Java Object class defines equals() to return whether
    //the param object is the same reference as "this" object with ==
    //-override the equals() method so you define how two objects are considered
    //equal
    //-two Animal objects are equal if they have the
    //same name and energy value

    //-parameter type needs to be Object, as defined by
    //the Java Object class
    public boolean equals(Object o) {
        //check if the param actual type is an Animal
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            //check if the other object's name and energy
            //match this object's name and energy
            if (other.name.equals(this.name) && other.energy == this.energy) {
                return true;
            }
        }
        return false;
    }
}

