package zooKeeper;

public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public Integer fly() {
        energyLevel -= 50;

        System.out.println("Pshhhhh");
        return energyLevel;
    }

    public Integer eatHumans() {
        energyLevel += 25;

        System.out.println("That was tasty");
        return energyLevel;
    }

    public Integer attackTOwn() {
        energyLevel -= 100;

        System.out.println("That took so much energy");

        return energyLevel;
    }


}
