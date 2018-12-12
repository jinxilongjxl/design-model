public class Main {

    public static void main( String[] args ) {

        Operation operation = OperationFactory.createOperation("*");
        operation.numberA = 10;
        operation.numberB = 20;
        double res = operation.getResult();
        System.out.println(res);

    }

}
