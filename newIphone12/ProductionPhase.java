package newIphone12;

public class ProductionPhase extends CodingPharse {
    String liveStreaming= "we can watch live event.";
    public void liveStreaming(){
        System.out.println(liveStreaming );
    }

    @Override
    public void messenger() {
        System.out.println("we can chat here.");
    }

    public static void main(String[] args) {
        ProductionPhase pro= new ProductionPhase();
        pro.colors();
        pro.call();
        pro.camera();
        pro.gaming();
        pro.tex();
        pro.messenger();
        pro.liveStreaming();
        pro.gambling();


    }


}
