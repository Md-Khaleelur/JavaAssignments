package khaleel.assignment.main;

import khaleel.assignment.data.First;
import khaleel.assignment.singleton.Second;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        first.print();
        first.anotherMethod();

        Second second = new Second();
        second.nonStaticMethod("non-static method");
        second.staticMethod("static method");
    }
}
