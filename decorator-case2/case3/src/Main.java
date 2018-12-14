public class Main {

    public static void main( String[] args ) {

        Person person = new Person("小明");
        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();

        tshirt.decorate(person);
        bigTrouser.decorate(tshirt);

        bigTrouser.show();

    }

}
