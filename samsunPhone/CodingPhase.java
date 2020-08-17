package samsunPhone;

public abstract class CodingPhase implements DesignPhase  {
    @Override
    public void calling() {
        System.out.println("We can make a phone call using Samsung Phone.");
    }

    @Override
    public void text() {
        System.out.println(" We can send a beautiful text to our friend using text option.");
    }

    @Override
    public void gaming() {
        System.out.println("We can spend spare time playing an exciting game.");
    }
}
