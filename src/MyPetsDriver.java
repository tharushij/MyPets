public class MyPetsDriver
{
    public static void main(String[]args)
    {
        Dog rex = new Dog("rex", "german shepherd", 55, 160);
        Lizard Zuckerberg = new Lizard("Zuckerberg", "Blue-Tongued Skink", 69, 5000);
        Bird cornelius = new Bird("cornelius", "Chicken", 6, 500000000, "white", 5.5);

        //Speaking to pets!
        System.out.println("rex says: " + rex.Speak());
        System.out.println("zuckerberg says: " + Zuckerberg.Speak());
        System.out.println("cornelius says: " + cornelius.Speak());

        //Check unit conversion
        System.out.println("rex's weight in pounds is: " + rex.AmericanFreedomUnits());
        /*
        System.out.println(rex);
        System.out.println("\n" + Zuckerberg);
        System.out.println("\n" + chimken);
        */

    } //end method main
} //end class MyPetsDriver
