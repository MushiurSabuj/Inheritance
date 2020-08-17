package loopStatements;

public class Computer {
    public void computer(){
        String laptop="officeLaptop";

        switch(laptop){
            case "myLaptop":
                System.out.println("very nice laptop.");
                break;
            case "yourLaptop":
                System.out.println("you have a nice laptop.");
                break;
            case "officeLaptop":
                System.out.println("it is a desktop.");
        }
    }
}
