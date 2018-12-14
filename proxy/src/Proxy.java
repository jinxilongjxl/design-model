/**
 * Proxy:
 */
public class Proxy implements IGiveGift {

    Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolates() {
        pursuit.giveChocolates();
    }
}
