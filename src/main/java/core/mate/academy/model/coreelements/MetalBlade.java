package core.mate.academy.model.coreelements;

public class MetalBlade {
    private double size;

    public MetalBlade(double size) {
        this.size = size;
    }

    public void moveAhead() {
        System.out.println("Let`s make this ground flat!!!");
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
