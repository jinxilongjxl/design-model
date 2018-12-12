// 工厂：
public class PhoneFactory {

    public static Phone createPhone(String type) {

        Phone phone = null;

        switch (type) {
            case "oldPhone":
                phone = new OldPhone();
                break;
            case "smartPhone":
                phone = new SmartPhone();
                break;
        }

        return phone;
    }

}
