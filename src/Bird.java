public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; //inches

    public Bird(String name, String species, int age, double weight, String color, double wingspan, String food)
    {
        super(name, age, weight, food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    } //end full constructor which calls super

    public String Speak()
    {
        return "The universe is a simulation";
    }

    public int monthlyFeeding()
    {
        return 8;
    } //end method to daetermine number of feedings

    public String toString()
    {
        String output = super.toString() + "\nColor: " + color;
        output += "\nWingspan: " + wingspan + " inches";
        output += "\nSpecies: " + species;
        return output;
    }
}