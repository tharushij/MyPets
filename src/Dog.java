public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    } //end full constructor with call to super

    public String Speak()
    {
        if(this.age < 2)
        {

        } //end if
        return "Woof";
    } //end method Speak

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        } //end if puppy
        else
        {
            dailyFeedings = 1;
        } //end else adult

        return dailyFeedings * 30; //end method explaining how many feedings per month, for budgetary reasons
    }

    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;

        return output;
    } //end method toString with call to super
}