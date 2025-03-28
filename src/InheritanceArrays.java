public class InheritanceArrays {
    public static void main(String [] args) {

        //a collection (array/arraylist)
        //can have a type of the parent class
        //but the objects can be a mix of
        //any subclass type that falls under
        //the parent class
        Animal [] zoo = new Animal[5];
        zoo[0] = new Animal("Platypus");
        zoo[1] = new Goat("daniel", false);
        zoo[2] = new Capybara(true);
        zoo[3] = new Animal("parrot");
        zoo[4] = new Capybara(false);

        for (int i = 0; i < zoo.length; i++) {

            //name
            System.out.println(zoo[i].getName());

            //every Animal has sleep()
            //but Goat objects (incl any subclass objects)
            //use the overridden Goat sleep()
            zoo[i].sleep();

            //goat specific method - attack
            //Animals that aren't Goats don't have attack()
            //zoo[i].attack();
            if (zoo[i] instanceof Goat) {
                Goat g = (Goat)zoo[i];
                g.attack();

                //only get the Goat objects to run
                //(even though all Animal objects have a run method defined)
                g.run();
            }

            if (zoo[i] instanceof Capybara) {
                ((Capybara)zoo[i]).chill();
                ((Capybara)zoo[i]).chill(5);
            }

            System.out.println();
        }
    }
}
