package myPhone;

public class ReleaseClass extends CodingClass {
    @Override
    public void hangout() {
        System.out.println("We can hangout out there and communicate using this feature.");
    }
    public void hangout(String riverBank) {
        System.out.println(riverBank);
    }

    public static void main(String[] args) {
        ReleaseClass phn= new ReleaseClass();
        phn.calling();
        phn.Texting();
        phn.camera();
        phn.messenger();
        phn.liveStream();
        phn.hangout();
        phn.hangout("We can have a nice view.");
    }

}
