package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

class ExcavatorProducer implements MachineProducer<Machine> {
    private List<Machine> excavatorList;

    @Override
    public List<Machine> get() {
        excavatorList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Excavator temp = new Excavator();
            excavatorList.add(temp);
        }
        return excavatorList;
    }

    public List<Machine> getExcavatorList() {
        return excavatorList;
    }

    public void setExcavatorList(List<Machine> excavatorList) {
        this.excavatorList = excavatorList;
    }
}
