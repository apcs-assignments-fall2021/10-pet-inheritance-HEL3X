public class Dog extends Pet {
    // Instance variable(s)
    private String name;
    private int age;
    private String breed;


    // Constructors
    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Dog(){
        this.name = "Walter";
        this.age = 10;
        this.breed = "Bull Terrier";
    }

    // makeNoise() method

    @Override
    public void makeNoise() {
        System.out.println("Bark! Bark! Bark!");
    }

    // toString method

    @Override
    public String toString() {
        return "Dog: " + "\n" +
                "   Name: " + name + "\n" +
                "   Age: " + age + "\n" +
                "   Breed: " + breed;
    }


    // Getter

    public String getBreed() {
        return breed;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }


    //Setter

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}