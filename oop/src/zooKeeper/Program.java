package zooKeeper;

public class Program {
    public static void main(String[] args) {
        Gorilla mickey = new Gorilla();
        Bat marky = new Bat();

        mickey.throwSomething();
        mickey.throwSomething();
        mickey.throwSomething();
        mickey.displayEnergy();

        mickey.eatBannana();
        mickey.eatBannana();
        mickey.eatBannana();
        mickey.displayEnergy();

        mickey.climb();
        mickey.displayEnergy();

        marky.attackTOwn();
        marky.attackTOwn();
        marky.attackTOwn();
        marky.displayEnergy();

        marky.eatHumans();
        marky.eatHumans();
        marky.displayEnergy();

        marky.fly();
        marky.fly();
        marky.displayEnergy();
    }

}
