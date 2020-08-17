package phone;

public class ExtendPhase extends ImplementationPhase {
    @Override
    public void modeling() {
        System.out.println("we can modeling.");
    }

    @Override
    public void camera() {
        System.out.println("we have a nice camera.");
    }
    String hangout="we can do live chat.";
    public void messenger(){ System.out.println(hangout);
    }

    public static void main(String[] args) {
        ExtendPhase ex=new ExtendPhase();
        ex.calling();
        ex.gaming();
        ex.text();
        ex.camera();
        ex.messenger();
        ex.modeling();

    }
}
