package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<Bulldozer> bulldozerList = bulldozerProducer.get();

            return new ArrayList<>(bulldozerList);
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<Excavator> excavatorList = excavatorProducer.get();

            return new ArrayList<>(excavatorList);
        }
        if (type.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            List<Truck> truckList = truckProducer.get();
            return new ArrayList<>(truckList);
        }

        return /*Collections.emptyList()*/ new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
    }
}
