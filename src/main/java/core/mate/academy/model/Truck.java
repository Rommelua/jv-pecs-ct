package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeOfTruck; //Wheeled
    private String nameOfTruck; //Caterpillar
    private int weightOfTruck; //48,988kg

    public Truck() {

    }

    public Truck(String typeOfTruck, String nameOfTruck, int weightOfTruck) {
        this.typeOfTruck = typeOfTruck;
        this.nameOfTruck = nameOfTruck;
        this.weightOfTruck = weightOfTruck;
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public String getNameOfTruck() {
        return nameOfTruck;
    }

    public void setNameOfTruck(String nameOfTruck) {
        this.nameOfTruck = nameOfTruck;
    }

    public int getWeightOfTruck() {
        return weightOfTruck;
    }

    public void setWeightOfTruck(int weightOfTruck) {
        this.weightOfTruck = weightOfTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
