package controlFlow;

public class CarClass {
    public static void main(String[] args) {
        String []cars={"tsla","toyota", "audi","ford"};
        System.out.println(cars.length);
        int i=0;
        do {
            System.out.println(cars[i]);
            i++;
        }while(i<cars.length);
        }
    }
