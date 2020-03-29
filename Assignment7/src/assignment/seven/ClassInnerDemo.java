package assignment.seven;//JAVA ASSIGNMENT 7 PART 4

public class ClassInnerDemo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        classTwo.new InnerTwo();
    }
}

class ClassOne{
    class InnerOne{
        public InnerOne(String string){
            System.out.println(string+"From InnerTwo");
        }
    }
}

class ClassTwo{
    class InnerTwo extends ClassOne.InnerOne{
        public InnerTwo(){
            new ClassOne().super("To InnerOne");
        }
    }
}
