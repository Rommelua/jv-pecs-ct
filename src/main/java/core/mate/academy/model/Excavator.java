package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfExcavator; //Wheeled
    private String nameOfExcavator; //Caterpillar
    private int weightOfExcavator; //48,988kg

    public Excavator() {

    }

    public Excavator(String typeOfExcavator, String nameOfExcavator, int weightOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
        this.nameOfExcavator = nameOfExcavator;
        this.weightOfExcavator = weightOfExcavator;
    }

    public String getTypeOfExcavator() {
        return typeOfExcavator;
    }

    public void setTypeOfExcavator(String typeOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
    }

    public String getNameOfExcavator() {
        return nameOfExcavator;
    }

    public void setNameOfExcavator(String nameOfExcavator) {
        this.nameOfExcavator = nameOfExcavator;
    }

    public int getWeightOfExcavator() {
        return weightOfExcavator;
    }

    public void setWeightOfExcavator(int weightOfExcavator) {
        this.weightOfExcavator = weightOfExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
