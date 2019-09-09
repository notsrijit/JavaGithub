import java.util.Scanner;
class ConstructorPar{
    ConstructorPar(String n, int a){
        System.out.println("Hi, "+n+". You are "+a+" years old.");
    }
}
class ConstructorParDriv{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name and age");
        String name = sc.nextLine();
        int age = sc.nextInt();
        ConstructorPar obj = new ConstructorPar(name, age);
    }
}