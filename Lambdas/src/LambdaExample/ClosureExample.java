package LambdaExample;

public class ClosureExample {

    public static void main(String[] args) {

        int i = 10;
        int b = 20;

        doProcess(i, (a)-> System.out.println(a+b)); //b is a closure because this is frozen and is used as same value in later as well
    }

    private static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
