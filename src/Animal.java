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
}
