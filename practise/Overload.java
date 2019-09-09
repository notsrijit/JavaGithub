import java.util.Scanner;
class Overload{
    Overload(){
        System.out.println("A non-parameterised constructor");
    }
    Overload(String n, int a){
        System.out.println("A parameterised one, made by "+n+" who is "+a+" years old");
    }
}
class OverloadDriv{
    public static void main(String[] args) {
        Overload obj = new Overload();
        Overload obj1 = new Overload("Srijit", 21);
    }
}