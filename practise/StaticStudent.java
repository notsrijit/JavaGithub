import java.util.Scanner;
class StaticStudent{
    int roll;
    String name;
    static String college = "UEM";

    StaticStudent(int r, String n){
        roll = r;
        name = n;
    }

    void display(){
        System.out.println(roll + "  " + name + "  " + college);
    }
}
class StudentDriv{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name;
        int roll;

        // Student 1
        System.out.println("Enter name and roll no.");
        name = sc.nextLine();
        roll = sc.nextInt();
        StaticStudent obj1 = new StaticStudent (roll, name);

        // Student 2
        System.out.println("Enter name and roll no.");
        name = sc.nextLine();
        name = sc.nextLine();
        roll = sc.nextInt();
        StaticStudent obj2 = new StaticStudent (roll, name);

        obj1.display();
        obj2.display();
    }
}