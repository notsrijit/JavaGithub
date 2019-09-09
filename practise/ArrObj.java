import java.util.Scanner;
class Student{
    String name;
    int roll;
    public Student(String n, int r){
      name = n;
      roll = r;
    }
    void display(int i){
        System.out.println("Student "+(i+1)+":");
        System.out.println("Name: "+name+"  Roll.no: "+roll);
    }
  }
  
  class StudentDriv{
    public static void main(String[] args){
      Student obj[] = new Student[10];
      for(int i=0; i<2; i++){
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter name and roll of student");
          String name = sc.nextLine();
          int roll = sc.nextInt();
          obj[i] = new Student (name, roll);          
      }
      System.out.println("______________________");
      System.out.println("Data of all students: ");
      for( int i=0; i<2; i++){
            obj[i].display(i);
      }      
    }
  }