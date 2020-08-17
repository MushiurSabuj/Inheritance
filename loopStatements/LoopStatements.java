package loopStatements;

public class LoopStatements {
    public static void main(String[] args) {
        int[] facebookID = new int[7];
        try {
            facebookID[0] = 300;
            facebookID[1] = 301;
            facebookID[2] = 302;
            facebookID[3] = 303;
            facebookID[4] = 304;
            facebookID[5] = 305;
            facebookID[6] = 306;
            facebookID[7] = 307;
        } catch (Exception get) {
            get.printStackTrace();
            System.out.println("Give a warning to the user for inserting a additional input.");
        }
        System.out.println("Print the FacebookID: " + facebookID[4]);
        for (int a = 0; a < 5; a++) {
            System.out.println("Print facebookID as: " + facebookID[a]);
        }
        for (int a = 6; a > 0; a--) {
            System.out.println("Print facebookID: " + facebookID[a]);
        }
        int a = 0;
        while (a < 3) {
            a++;
            System.out.println("Print facebookID name: " + facebookID[a]);
        }
    }
}
