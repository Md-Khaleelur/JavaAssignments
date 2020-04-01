package khaleel.assignment.singleton;

public class Second {

    //String memberVar;
    private static String var;

    public static Second staticMethod(String string) {
        //memberVar = string;   static method cannot use non-static variables
        return new Second();
    }

    public void nonStaticMethod(String string) {
        var = string;
        System.out.println(var);
    }

}
