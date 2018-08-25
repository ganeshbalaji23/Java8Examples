package LambdaExample;

public class ThisReferenceExample {

    private void doProcess(int i, Process p) {
        p.process(i);
    }

    private void execute() {
        doProcess(20, (i) -> {
            System.out.println(i);
            //this reference refers to the object calling the method
            System.out.println(this);
        });

    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        //Anonymous inner class
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);//Refers to the Process  anonymous class reference
            }

            @Override
            public String toString() {
                return "This is a Process reference";
            }
        });

        //Using Lambda inside a static method and this reference cant be used
        thisReferenceExample.doProcess(20, (i) -> {
            System.out.println(i);
            /* this reference cannot be used in lambda, used in a static method,
             * as we don't refer to the interface by new keyword in lambda directly
             */
            //System.out.println(this);
        });

        //this Reference in a method called via object reference
        thisReferenceExample.execute();

    }

    @Override
    public String toString() {
        return "This is ThisReference example";
    }
}
