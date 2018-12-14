public class Main {

    public static void main( String[] args ) {

        IBeauty beauty = new Finery();
        HotDress hotDress = new HotDress();
        Cosmetic cosmetic = new Cosmetic();

        hotDress.setDecorate(beauty);
        cosmetic.setDecorate(hotDress);
        cosmetic.beBeautiful();


    }

}
