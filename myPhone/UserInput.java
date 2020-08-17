package myPhone;

public class UserInput {
    public static void main(String[] args) {
        int department[] = new int[5];
        try {
            department[0] = 200;
            department[1] = 201;
            department[2] = 203;
            department[3] = 204;
            department[4] = 205;
            department[5] = 206;
            department[6] = 207;
            department[7] = 208;
            System.out.println("department: " + department[4]);
        } catch (Exception problem) {
            problem.printStackTrace();
            System.out.println("provide signal to user.");
        }
        for (int x = 0; x < 8; x++) {
            System.out.println("Print the department as: " + department[x]);

        }
        for (int x = 6; x > 2; ) {
            System.out.println("Print the department as: " + department[x]);
            x--;
        }
    }
}

