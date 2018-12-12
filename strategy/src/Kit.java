// 装妙计的锦囊即策略的应用场景：
public class Kit {

    private IStrategy strategy;

    // 构造函数，指明你需要哪个妙计
    public Kit(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 需要使用的计谋
    public void operate() {
        this.strategy.operate();
    }


}
