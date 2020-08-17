package myPhone;

public abstract class CodingClass implements DesignClass, NewInterface {
    public abstract void hangout();
    @Override
    public void messenger() {
        System.out.println("Using messenger we can do group chat among our friends.");
    }

    @Override
    public void calling() {
        System.out.println("I can make a phone call to my friend using my cell phone.");
    }

    @Override
    public void Texting() {
        System.out.println("I can send a warm text message to my girlfriend using my cell phone.");
    }

    @Override
    public void camera() {
        System.out.println("We can do photo shot when we are in travel using my nice phone.");
    }

    public void liveStream() {
        System.out.println("We can watch live games.");
    }

}
