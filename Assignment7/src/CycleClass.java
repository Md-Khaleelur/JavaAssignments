//JAVA ASSIGNMENT 7 PART 4

interface Cycle{
    int noOfCycles();
    int cost();
}

class Unicycle implements Cycle{

    int num = 10;
    int money = 2000;
    @Override
    public int noOfCycles() {
        return num;
    }

    @Override
    public int cost() {
        return money;
    }
}

class UnicycleFactory extends Unicycle{
    void showcase(){
        System.out.println("UnicycleFactory");
        System.out.println("No of cyles "+noOfCycles());
        System.out.println("Cost of Cycle "+cost());
    }
}

class BicycleFactory extends Bicycle{
    void showcase(){
        System.out.println("BicycleFactory");
        System.out.println("No of cyles "+noOfCycles());
        System.out.println("Cost of Cycle "+cost());
    }
}

class TricycleFactory extends Tricycle{
    void showcase(){
        System.out.println("TricycleFactory");
        System.out.println("No of cyles "+noOfCycles());
        System.out.println("Cost of Cycle "+cost());
    }
}

class Bicycle implements Cycle{

    int num = 20;
    int money = 2500;
    @Override
    public int noOfCycles() {
        return num;
    }

    @Override
    public int cost() {
        return money;
    }
}

class Tricycle implements Cycle{

    int num = 30;
    int money = 3000;
    @Override
    public int noOfCycles() {
        return num;
    }

    @Override
    public int cost() {
        return money;
    }
}

public class CycleClass {
    public static void main(String[] args) {

        UnicycleFactory unicycleFactory = new UnicycleFactory();
        unicycleFactory.showcase();

        BicycleFactory bicycleFactory = new BicycleFactory();
        bicycleFactory.showcase();

        TricycleFactory tricycleFactory = new TricycleFactory();
        tricycleFactory.showcase();

    }
}
