package lesson6;

public class HomeWorkApp {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Fluffy");
        Cat cat2 = new Cat("Kit-Kat");
        Cat cat3 = new Cat("Whiskers");

        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Woody");

        Mammals[] animals = {cat1, cat2, cat3, dog1, dog2};

        int run1 = 210;
        int run2 = 190;
        int swim1 = 9;
        int swim2 = 11;

        System.out.println("Tour 1.");
        System.out.println("************************");

        for (int i = 0; i < animals.length; i++) {
           animals[i].printRun(run1);
        }
        for (int i = 0; i < animals.length; i++) {

            animals[i].printSwim(swim1);
        }
        System.out.println("Tour 2.");
        System.out.println("************************");

        for (int i = 0; i < animals.length; i++) {
            animals[i].printRun(run2);
        }
        for (int i = 0; i < animals.length; i++) {
            animals[i].printSwim(swim2);
        }
    }
}