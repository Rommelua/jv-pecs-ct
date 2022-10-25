package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

class TruckProducer implements MachineProducer<Machine> {
    private List<Machine> truckList;

    @Override
    public List<Machine> get() {
        truckList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Truck temp = new Truck();
            truckList.add(temp);
        }
        return truckList;
    }

    public List<Machine> getTruckList() {
        return truckList;
    }

    public void setTruckList(List<Machine> truckList) {
        this.truckList = truckList;
    }
}
