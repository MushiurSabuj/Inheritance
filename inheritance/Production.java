package inheritance;

public class Production extends Coding {
    @Override
    public void badDesign() {
        System.out.println("This is bad Design.");
    }
    public void goodDesign(){
        System.out.println("This is a good design.");
    }
    public void goodDesign(String insert){
        System.out.println(insert);
    }

    public static void main(String[] args) {
        Production apple = new Production();
        apple.newDesign();
        apple.recentDesign();
        apple.oldDesign();
        apple.badDesign();
        apple.goodDesign();
        apple.goodDesign("insert input here.");
        apple.absoluteDesign();
    }
}
