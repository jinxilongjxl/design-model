/**
 * 测试：
 */
public class Main {

    public static void main( String[] args ) {

        // 创建老年机实例
//        Phone phone = PhoneFactory.createPhone("oldPhone");
//        phone.send();

        // 创建智能机实例
        Phone phone = PhoneFactory.createPhone("smartPhone");
        phone.send();

    }

}
