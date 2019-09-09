import java.util.Scanner;
class Grader{
    int s;
    Grader(int score){
        s=score;
    }
    char letterGrade(){
        if(s>90 && s<=100)
            return 'O';
        else if(s>80 && s<=90)
            return 'E';
        else if(s>80 && s<=90)
            return 'A';
        else if(s>70 && s<=80)
            return 'B';
        else if(s>60 && s<=50)
            return 'C';
        else
            return 'F';
    }
}
class GraderDriv{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Score:");
        int score = sc.nextInt();
        while (score < 0){
            if (score < 0){
                System.out.println("Score can't be negative. Enter Again!!!");
            }
        }
        Grader obj = new Grader(score);
        char g=obj.letterGrade();
        System.out.println("Your grade Is: "+g);
    }
}