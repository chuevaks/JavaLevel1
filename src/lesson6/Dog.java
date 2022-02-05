package lesson6;

public class Dog extends Mammals{

    public static int countDog = 0;
    public static String thisSpecies = "Dog";


    public Dog(String name) {
        super(thisSpecies, name, 500, 10);
        countDog++;
    }
}