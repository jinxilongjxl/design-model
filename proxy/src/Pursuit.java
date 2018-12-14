/**
 * RealSubject:
 */
public class Pursuit implements IGiveGift {

    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + "送你玩具");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + "送你花");
    }

    @Override
    public void giveChocolates() {
        System.out.println(schoolGirl.getName() + "送你巧克力");
    }
}
