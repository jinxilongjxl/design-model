/**
 * 老年机：
 */
public class OldPhone implements Phone {
    @Override
    public void send() {
        System.out.println("老年机可以发短信");
    }
}
