package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Excavator temp = new Excavator();
            excavatorList.add(temp);
        }
        return excavatorList;
    }
}
