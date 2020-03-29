//JAVA ASSIGNMENT 7 PART 2
package assignment.seven;

public class Cycle {

    public void balance(){
        System.out.println("Inside Cycle");
    }

    public static void main(String[] args) {

        //Upcasting  of the objects
        Cycle cycle[] =new Cycle[4];
        cycle[0] = (Cycle)new Unicycle();
        cycle[1] = (Cycle)new Bicycle();
        cycle[2] = (Cycle)new Tricycle();
        cycle[3] = new Cycle();

        //Downcasting shows ClassCastException
        for (int i=0;i<3;i++){
             cycle[i].balance();
        }

    }
}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Inside Unicycle");
    }
}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Inside Bicycle");
    }
}

class Tricycle extends Cycle{

}