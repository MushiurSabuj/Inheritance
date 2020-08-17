package controlFlow;

public class WhileStatement {
    public static void main(String[] args) {
        int score=76;
        String grade = null;

        if(score >80){
            grade="B";
        }
        else if(score>70){
            grade="C";
        }
        else if(score>=60){
            grade="D";
        }
        System.out.println("grade: " + grade);
    }
}
