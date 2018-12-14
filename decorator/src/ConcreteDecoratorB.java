public class ConcreteDecoratorB extends Decorator {

    @Override
    public void eat() {
        super.eat();
        this.extendedFunctionB();
    }

    private void extendedFunctionB() {
        System.out.println("扩展的新功能B");
    }
}
