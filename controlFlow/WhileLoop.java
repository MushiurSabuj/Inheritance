package controlFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int age=4;
        while(age<5){
            System.out.println(age);
            age--;
            if (age==-2){
                break;
            }

            int i=0;
            do {
                System.out.println(i);
                i++;
            }
            while(i<5);
            }

        }
    }
