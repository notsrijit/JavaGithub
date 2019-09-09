import java.util.Scanner;
class StaticMethod{
    int roll;
    String name;
    static String college = "UEM";

    static void change(){
        college = "IEM Newtown";
    }

    StaticMethod(int r, String n){
        roll = r;
        name = n;
    }

    void display(){
        System.out.println(roll + "  " + name + "  " + college);
    }
}
class StudentDriv{
    public static void main(String[] args) {
        StaticMethod.change();

        Scanner sc = new Scanner (System.in);
        String name;
        int roll;

        // Student 1
        System.out.println("Enter name and roll no.");
        name = sc.nextLine();
        roll = sc.nextInt();
        StaticMethod obj1 = new StaticMethod (roll, name);

        // Student 2
        System.out.println("Enter name and roll no.");
        name = sc.nextLine();
        name = sc.nextLine();
        roll = sc.nextInt();
        StaticMethod obj2 = new StaticMethod (roll, name);

        obj1.display();
        obj2.display();
    }
}