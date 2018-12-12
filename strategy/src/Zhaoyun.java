/**
 * 使用者赵云：
 */
public class Zhaoyun {

    public static void main( String[] args ) {

        Kit kit;
        // 使用第一条妙计
        kit = new Kit(new StrategyA());
        kit.operate();

        // 使用第二条妙计
        kit = new Kit(new StrategyB());
        kit.operate();

        // 使用第三条妙计
        kit = new Kit(new StrategyC());
        kit.operate();

    }

}
