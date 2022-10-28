package core.mate.academy.model;

import core.mate.academy.model.coreelements.MetalBlade;

public class Bulldozer extends Machine {

    private MetalBlade blade;

    public Bulldozer() {
    }

    public MetalBlade getBlade() {
        return blade;
    }

    public void setBlade(MetalBlade blade) {
        this.blade = blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
