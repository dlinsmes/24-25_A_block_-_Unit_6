public class Polymorphism {
    public static void main(String [] args) {

        Animal a = new Animal("greg");
        Goat g = new Goat("danny", true);

        a.eat(); //+5
        a.sleep(); //+20

        //goat overrides the behavior of the animal sleep() method
        g.sleep(); //doubles
        g.eat(); //eat() is inherited from Animal

        System.out.println(a);
        System.out.println(g);

        //once you're in a client class, you no longer have access
        //to a parent class's version of a method that has been
        //overridden
        //-can't access the Animal version of sleep from g (Goat)
        //g.super.sleep()

        g.attack();

        //attack() does not exist for the Animal class
        //a.attack();

        //can declare as a parent type and instantiate as a child type
        //Animal is the declared type
        //Goat is the actual type
        Animal b = new Goat("jiamu", true);

        //doesn't work the other way around
        //Goat c = new Animal("fdasfsa");

        //have direct access to the methods in the declared type
        //-declared type of b is Animal
        b.eat();
        b.run();

        //if a method has been overridden, the overridden version of the
        //method gets used
        b.sleep(); //Goat version of sleep will run

        //attack() was NOT declared in Animal, so you can't directly access it
        //b.attack();

        //cast the object as a goat and save it to a goat variable
        Goat g2 = (Goat) b;
        //call attack() from the goat var
        g2.attack();

        //same thing but condensed
        ((Goat)b).attack();

        //class cast exception - a has an actual type of Animal, not Goat
        //Goat g3 = (Goat)a;

        //use code to check the type before you cast
        if (b instanceof Goat) {
            ((Goat)b).attack();
        }
        else {
            System.out.println("not a goat");
        }

        //protect the program from crashing by checking the
        //actual type before casting
        if (a instanceof Goat) {
            ((Goat)a).attack();
        }
        else {
            System.out.println("not a goat");
        }

        Animal a2 = new Animal("Bob");
        Animal a3 = new Animal("Bob");
        Animal a4 = a3; //a4 is the same object as a3 - not a duplicate

        //== checks whether the object is the same (not checking if it's a separate copy)
        System.out.println("a2 == a3: " + (a2 == a3));
        System.out.println("a3 == a4: " + (a3 == a4));

        //== cannot be overridden, but the .equals() method can be overridden
        System.out.println("a2.equals(a3): " + a2.equals(a3));

        //since the param type for .equals() is an object, any kind of
        //object can be used as the argument
        System.out.println(a2.equals("blahhhhhh"));

        Goat g3 = new Goat("Bob", false);
        Goat g4 = new Goat("Bob", false);
        System.out.println("g3.equals(g4): " + g3.equals(g4));

        //calls the Animal equals() from a2
        System.out.println("a2.equals(g3): " + a2.equals(g3));

        //calls the Goat equals() from g3
        System.out.println("g3.equals(a2): " + g3.equals(a2));
    }
}
