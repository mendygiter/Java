package zooKeeper;

public class Gorilla  extends Mammal{

    public Integer throwSomething() {
        energyLevel -= 5;

        System.out.println("Gorilla threw something");

        return energyLevel;
    }

    public Integer eatBannana() {
        energyLevel += 10;

        System.out.println("Gorilla is very happy it just ate a banana");

        return energyLevel;
    }

    public Integer climb() {
        energyLevel -= 10;

        System.out.println("Gorilla has climbed a tree");

        return energyLevel;
    }
}

