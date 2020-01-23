public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight) {
        super (name, age, weight);
        this.species = species;
    } //end full constructor with calls to super

    public String Speak()
    {
        return "hisssss!";
    } //end method Speak

    public String toString() {
        String output = super.toString() + "Species: " + species;
        return output;
    } //end toString with call to super
} //end class lizard which IS a pet
