import java.util.*;
class Point{
    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Circle{
    double r;
    Circle(Point P1, Point P2){
        r=Math.sqrt((Math.pow((P1.x-P2.x),2))+(Math.pow((P1.y-P2.y),2)));
    }
    void area(){
        double area=3.14*r*r;
        System.out.println("Area= "+area);
    }
}
class ABC{
    public static void main(String[] args) {
        Point P1=new Point(1,2);
        Point P2=new Point(2,3);
        Circle C1=new Circle(P1, P2);

    }
}