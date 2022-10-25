package core.mate.academy.coreelements;

public class ExcavatorBucket {
    private String model;
    private double maxWeight;

    public ExcavatorBucket(String model, double maxWeight) {
        this.model = model;
        this.maxWeight = maxWeight;
    }

    public void dig() {
        System.out.println("Digging!!!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
