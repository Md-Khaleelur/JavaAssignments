//JAVA ASSIGNMENT 7 PART 3

interface IFirst {
    public void firstOne();
    public void firstTwo();
}

interface ISecond {
    public void secondOne();
    public void secondTwo();
}

interface IThird {
    public void thirdOne();
    public void thirdTwo();
}

interface IFourth extends IFirst,ISecond,IThird {
    public void fourthOne();
}

class ConcreteClass{

    public void concreteOne(IFirst i1){
        i1.firstOne();
        i1.firstTwo();
    }

    public void concreteTwo(ISecond i2){
        i2.secondOne();
        i2.secondTwo();
    }

    public void concreteThree(IThird i3){
        i3.thirdOne();
        i3.thirdTwo();
    }

    public void concreteFourth(IFourth i4){
        i4.firstOne();
        i4.secondOne();
        i4.thirdOne();
        i4.fourthOne();
    }

}

public class ThirdClassMain extends ConcreteClass implements IFourth{

    @Override
    public void firstOne() {
        System.out.println("Interface 1 method 1");
    }

    @Override
    public void firstTwo() {
        System.out.println("Interface 1 method 2");
    }

    @Override
    public void secondOne() {
        System.out.println("Interface 2 method 1");
    }

    @Override
    public void secondTwo() {
        System.out.println("Interface 2 method 2");
    }

    @Override
    public void thirdOne() {
        System.out.println("Interface 3 method 1");
    }

    @Override
    public void thirdTwo() {
        System.out.println("Interface 3 method 2");
    }

    @Override
    public void fourthOne() {
        System.out.println("Interface 4 method 1");
    }

    public static void main(String[] args) {
        ThirdClassMain classObject = new ThirdClassMain();
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.concreteOne(classObject);
        concreteClass.concreteTwo(classObject);
        concreteClass.concreteThree(classObject);
        concreteClass.concreteFourth(classObject);


    }

}
