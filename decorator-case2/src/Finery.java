/**
 * Decorator
 */
public class Finery implements IBeauty {

    protected IBeauty beauty;

    public void setDecorate(IBeauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public void beBeautiful() {
        if (beauty != null) {
            beauty.beBeautiful();
        }
    }
}
