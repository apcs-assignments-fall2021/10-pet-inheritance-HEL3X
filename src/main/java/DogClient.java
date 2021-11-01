public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setBreed("English Greyhound");
        d1.setAge(3);
        d1.setName("Doggy");
        System.out.println(d1.toString());
        System.out.println();
        d1.makeNoise();
    }
}