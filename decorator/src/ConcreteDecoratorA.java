public class ConcreteDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ConcreteDecoratorA");
    }

    private void reEat() {

        System.out.println("再吃一顿");
    }
}
