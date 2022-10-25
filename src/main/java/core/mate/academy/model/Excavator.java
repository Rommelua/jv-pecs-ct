package core.mate.academy.model;

import core.mate.academy.coreelements.ExcavatorBucket;

public class Excavator extends Machine {
    private ExcavatorBucket bucket;

    public Excavator() {
    }

    public ExcavatorBucket getBucket() {
        return bucket;
    }

    public void setBucket(ExcavatorBucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
