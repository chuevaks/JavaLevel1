package lesson6;

public abstract class Mammals {

    static final int NO_SWIM = -1;
    static final int SWIM = 1;
    static final int FAIL_SWIM = 0;

    private String species;
    private String name;
    private int maxRun;
    private int maxSwim;

    public static int countMammals = 0;

    public Mammals(String species, String name, int maxRun, int maxSwim) {
        this.species = species;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        countMammals++;
    }

    protected boolean run(int distance) {
        return (distance <= maxRun);
    }

    protected int swim(int distance) {
        return (distance <= maxSwim) ? SWIM : FAIL_SWIM;
    }

    String getName() {
        return this.name;
    }

    String getSpecies() {
        return this.species;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void printRun(int distance) {
        String a = getSpecies() + " " + getName() + " can run " + getMaxRun() + " m";
        String result = run(distance) ? " successfully " : " unsuccessfully ";
        String b = getSpecies() + " " + getName() + result + "runs " + distance + " m";
        System.out.println(a);
        System.out.println(b);
    }

    public void printSwim(int distance) {
        String b;

        String a = getSpecies() + " " + getName() + " can swim " + getMaxSwim() + " m";
        int result = swim(distance);
        switch (result) {
            case FAIL_SWIM:
                b = getSpecies() + " " + getName() + " unsuccessfully swims " + distance + " m";
                break;
            case SWIM:
                b = getSpecies() + " " + getName() + " successfully swims " + distance + " m";
                break;
            default:
                a = "";
                b = getSpecies() + " " + getName() + " can not swim";
                break;
        }
        if (!a.equals(""))
            System.out.println(a);
        System.out.println(b);
    }
}