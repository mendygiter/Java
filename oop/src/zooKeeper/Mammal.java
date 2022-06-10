package zooKeeper;

public class Mammal {

    public Integer energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public void displayEnergy() {
        System.out.println("your energy level is: " + energyLevel);
    }

}
