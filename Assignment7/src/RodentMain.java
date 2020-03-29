//JAVA ASSIGNMENT 7 PART 1

abstract class Rodent {

    Rodent() {
        System.out.println("Inside Rodent constructor");
    }

    abstract void specify();
}

class Mouse extends Rodent{
    Mouse() {
        System.out.println("Inside Mouse Constructor");
    }

    public void specify() {
        System.out.println("This is Mouse");
    }
}

class Gerbil extends Rodent{
    Gerbil() {
        System.out.println("Inside Gerbil constructor");
    }

    public void specify() {
        System.out.println("This is Gerbil");
    }
}

class Hamster extends Rodent{
    Hamster() {
        System.out.println("Inside Hamster constructor");
    }

    public void specify() {
        System.out.println("This is Hamster");
    }

}

public class RodentMain {
    public static void main(String[] args) {

        Rodent rodent[] = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();

        for (int i = 0; i < rodent.length; i++) {
            rodent[i].specify();
        }
    }
}
