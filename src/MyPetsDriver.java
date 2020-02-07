public class MyPetsDriver
{
    public static void main(String[]args)
    {
        Dog rex = new Dog("rex", "german shepherd", 55, 160.66, "kibble");
        Lizard Zuckerberg = new Lizard("Zuckerberg", "Blue-Tongued Skink", 69, 5000, "bugs");
        Bird cornelius = new Bird("cornelius", "Chicken", 6, 500000000, "white", 5.5, "seeds");

        System.out.println(rex.toString() + "\nNumber of monthly feedings: " + rex.monthlyFeeding());
        System.out.println();
        System.out.println(Zuckerberg.toString() + "\nNumber of monthly feedings: " + Zuckerberg.monthlyFeeding());
        System.out.println();
        System.out.println(cornelius.toString() + "\nNumber of monthly feedings: " + cornelius.monthlyFeeding());
        System.out.println("\nCW 7.5 - Tharushi Jayasinghe");
        /*
        //Speaking to pets!
        System.out.println("rex says: " + rex.Speak());
        System.out.println("zuckerberg says: " + Zuckerberg.Speak());
        System.out.println("cornelius says: " + cornelius.Speak());

        //Check unit conversion
        System.out.println("rex's weight in pounds is: " + rex.AmericanFreedomUnits());

        System.out.println(rex);

        System.out.println("\n" + Zuckerberg);
        System.out.println("\n" + chimken);
        */
    } //end method main
} //end class MyPetsDriver