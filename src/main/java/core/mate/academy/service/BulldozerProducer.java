package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Machine> get() {
        List<Machine> bulldozerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Bulldozer temp = new Bulldozer();
            bulldozerList.add(temp);
        }
        return bulldozerList;
    }
}
