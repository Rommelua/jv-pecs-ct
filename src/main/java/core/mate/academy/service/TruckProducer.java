package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Truck temp = new Truck();
            truckList.add(temp);
        }
        return truckList;
    }
}
