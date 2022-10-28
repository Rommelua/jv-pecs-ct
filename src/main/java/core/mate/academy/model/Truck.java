package core.mate.academy.model;

import core.mate.academy.model.coreelements.MachineGun;

public class Truck extends Machine {
    private MachineGun gun;

    public Truck(MachineGun gun) {
        this.gun = gun;
    }

    public Truck() {
    }

    public MachineGun getGun() {
        return gun;
    }

    public void setGun(MachineGun gun) {
        this.gun = gun;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
