import java.util.Scanner;
class Constructor{
    int num;
    Constructor(){
        num=0;
        System.out.println("Random Constructor Called");
    }
}
class ConstructorDriv{
    public static void main(String[] args) {
        Constructor obj = new Constructor();
    }
}