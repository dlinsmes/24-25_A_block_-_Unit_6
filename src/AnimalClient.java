public class AnimalClient {
    public static void main(String [] args) {
        Animal blah = new Animal("lebron");
        blah.eat();
        blah.sleep();
        blah.run();
        System.out.println(blah);

        Goat g = new Goat("bronny", false);

        //a child class object has access to the parent
        //class methods
        g.eat();
        g.run();

        g.attack();

        //a parent class object does NOT have
        //access to the child class methods
        //-an Animal is NOT necessarily a goat
        //blah.attack();

        g.sleep();

        System.out.println(g);
    }
}
