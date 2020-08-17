package inheritance;

public abstract class Coding implements Design, AnotherFile {
    @Override
    public void absoluteDesign() {
        System.out.println("This very rare type of Design.");
    }

    @Override
    public void newDesign() {
        System.out.println("We will show how to do design or blue print for our project.");
    }

    @Override
    public void recentDesign() {
        System.out.println("In the recent time the project design has changed the way it used to be.");

    }

    @Override
    public void oldDesign() {
        System.out.println("Now a days the old design has become very absolute. ");

    }
    public abstract void badDesign();
}

