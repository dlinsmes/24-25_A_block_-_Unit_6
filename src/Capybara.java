//a subclass of Goat
public class Capybara extends Goat{

    private boolean chill;

    public Capybara(boolean c) {
        //call the parent class constructor with super()
        super("jiamu the capybara", true);
        chill = c;
    }

    public void run() {
        System.out.println("i am a large capybara running verry very fast!!!");
    }

    public void chill() {
        System.out.println("am i poisonous????");
    }
    //overloading - two methods have the same name
    //but different sets of parameters
    public void chill(int blah) {
        for (int i = 0; i < blah; i++)
            System.out.print("chill ");
        System.out.println("capybara");
    }

    //overriding - redefine a parent class method
    //-method header needs to match (except for the name of the params)
    public boolean equals(Object o) {
        //check the actual type
        if (o instanceof Capybara) {
            //cast to a Capybara
            Capybara other = (Capybara) o;
            if (super.equals(other) && other.chill == this.chill) {
                return true;
            }
        }

        return false;
    }

}
