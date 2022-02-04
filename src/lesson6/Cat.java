package lesson6;

public class Cat extends Mammals {

    public static int countCat = 0;
    public static String thisSpecies = "Cat";

    public Cat(String name) {
        super(thisSpecies, name, 200, 0);
    }

    @Override
    protected int swim(int distance) {
        return Mammals.NO_SWIM;
    }
}