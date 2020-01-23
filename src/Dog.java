public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    } //end full constructor with call to super

    public String toString()
    {
        String output = super.toString() + "Breed: " + breed;

        return output;
    } //end method toString with call to super
}
