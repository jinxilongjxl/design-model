public class OperationFactory {

    public static Operation createOperation(String operator) {

        Operation operation = null;

        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
                default:
                    try {
                        throw new Exception("输入操作符号有误");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


        }
        return operation;

    }

}
