package enumClass;

public class CallingEnum {
    public static void main(String[] args) {
        EnumData myEnum= null;
        EnumData today=myEnum.COMPUTER;
        System.out.println(today);
        EnumData tommorow=myEnum.NAME;
        System.out.println(tommorow);
    }
}
