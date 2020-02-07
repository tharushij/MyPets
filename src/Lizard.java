public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight, String food) {
        super (name, age, weight, food);
        this.species = species;
    } //end full constructor with calls to super

    public String Speak()
    {
        return "hisssss!";
    } //end method Speak

    public int monthlyFeeding()
    {
        return 15;
    }

    public String toString() {
        String output = super.toString() + "Species: " + species;
        return output;
    } //end toString with call to super
} //end class lizard which IS a pet
