package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBulldozer; //Heavy bulldozer
    private String nameOfBu; //Caterpillar
    private int weightOfBu; //48,988kg

    public Bulldozer() {
    }

    public Bulldozer(String type, String manufacturer, int weight) {
        this.typeOfBulldozer = type;
        this.nameOfBu = manufacturer;
        this.weightOfBu = weight;
    }

    public String getTypeOfBulldozer() {
        return typeOfBulldozer;
    }

    public void setTypeOfBulldozer(String typeOfBulldozer) {
        this.typeOfBulldozer = typeOfBulldozer;
    }

    public String getNameOfBu() {
        return nameOfBu;
    }

    public void setNameOfBu(String nameOfBu) {
        this.nameOfBu = nameOfBu;
    }

    public int getWeightOfBu() {
        return weightOfBu;
    }

    public void setWeightOfBu(int weightOfBu) {
        this.weightOfBu = weightOfBu;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
