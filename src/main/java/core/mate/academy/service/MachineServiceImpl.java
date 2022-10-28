package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        }
        if (type.equals(Truck.class)) {
            return new TruckProducer().get();

        }
        if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        }
        return Collections.emptyList();

    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (value.getClass().equals(Bulldozer.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i,value);
            }
            return;
        }
        if (value.getClass().equals((Truck.class))) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i,value);
            }
            return;
        }
        if (value.getClass().equals(Excavator.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i,value);
            }
            return;
        }
    }

    @Override
    public void startWorking(List<?extends Machine> list) {
        for (Machine machine:list) {
            machine.doWork();
        }
    }
}
