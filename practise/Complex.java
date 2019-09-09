import java.util.Scanner;
class Complex{
    int real;
    int imaginary;
    Complex (int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void add(Complex obj2){
        this.real=this.real+obj2.real;
        this.imaginary= this.imaginary+obj2.imaginary;
    }
    void display(){
        System.out.println("The value: "+real+"+i"+imaginary);
    }
}
class ComplexDriv{
    public static void main(String[] args) {
        Complex obj = new Complex(1,2);
        Complex obj1 = new Complex(2,3);

        System.out.println("Before Add:");
        obj.display();
        obj1.display();
        obj.add(obj1); //passing the objects

        System.out.println("After Add:");
        obj.display();
    }
}