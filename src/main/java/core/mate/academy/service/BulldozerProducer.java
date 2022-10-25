package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private List<Machine> bulldozerList;

    @Override
    public List<Machine> get() {
        bulldozerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Bulldozer temp = new Bulldozer();
            bulldozerList.add(temp);
        }
        return bulldozerList;
    }

    public List<Machine> getBulldozerList() {
        return bulldozerList;
    }

    public void setBulldozerList(List<Machine> bulldozerList) {
        this.bulldozerList = bulldozerList;
    }
}
