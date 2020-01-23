public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight) {
        super (name, age, weight);
        this.species = species;
    } //end method

    public String toString() {
        String output = super.toString() + "Species: " + species;
        return output;
    } //end toString with call to super
} //end class lizard which IS a pet
