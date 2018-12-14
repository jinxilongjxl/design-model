public class Main {

    public static void main( String[] args ) {

        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("李娇娇");

        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolates();
    }

}
