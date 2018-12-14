/**
 * 测试
 */
public class Main {

    public static void main( String[] args ) {

        Man man = new Man();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        concreteDecoratorA.setPerson(man);

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorB.setPerson(concreteDecoratorA);

        concreteDecoratorB.eat();

    }

}
