package core.mate.academy.model.coreelements;

public class MachineGun {
    private String name;
    private int numberofShots;

    public MachineGun(String name, int numberofShots) {
        this.name = name;
        this.numberofShots = numberofShots;
    }

    public void makeShot() {
        System.out.println("Boooom!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofShots() {
        return numberofShots;
    }

    public void setNumberofShots(int numberofShots) {
        this.numberofShots = numberofShots;
    }
}
