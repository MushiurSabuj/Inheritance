package dellComputer;

public class ProductionInterface extends CodingInterface {
    // This an example of override statement
    @Override
    public void hangout() {
        System.out.println("We can communicate through computer.");
    }
    //This is inserting a new method
    public void learning(){
        System.out.println("We can do online class using dell computer.");
    }
    //This is the example of overloading
    public void learning(String liveStreaming){
        System.out.println(liveStreaming);
    }

    public static void main(String[] args) {
        ProductionInterface time= new ProductionInterface();
        time.onlineActivity();
        time.onlineGaming();
        time.watchingMovies();
        time.transaction();
        time.hangout();
        time.learning();
        time.telecast();
        time.learning("Live streaming service is very increasing these days. We can watch live games in dell computer.");
    }
}
