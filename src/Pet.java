import java.text.DecimalFormat; //to format the weight in pounds
public abstract class Pet
{
    //Instance variables
    protected String name;
    protected int age;
    protected double weight; //kilograms
    DecimalFormat fmt = new DecimalFormat("#.#"); //create formatting object

    //Constructor(s)
    public Pet(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    } //end full constructor

    //Brain methods
    abstract public String Speak(); //to be overridden in all child classes

    //if the method will be written/modified in the other class, it needs to be declared as abstract and vice versa
    public double AmericanFreedomUnits()
    {
        return weight * 2.205;
    } //end method to convert weight value into pounds

    //getters
    public String getName()
    {
        return name;
    } //end getter

    //setters
    public String setName()
    {
        return name;
    } //end setter

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg " + "(" + fmt.format(AmericanFreedomUnits())+ " in pounds)";

        return output;
    } //end method toString which is called in all child classes
} //end class pet which is parent to child classes
