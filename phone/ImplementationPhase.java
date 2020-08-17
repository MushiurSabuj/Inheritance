package phone;

public abstract class ImplementationPhase implements DesignPhase, ExtraDesignPhase {
    @Override
    public void gaming() {
        System.out.println("we can insert games here.");
    }

    @Override
    public void calling() {
        System.out.println("we can make phn call.");
    }

    @Override
    public void text() {
        System.out.println("we can send text messages.");
    }
    public void camera(){
        System.out.println("we can take photo using camera.");
    }
}
