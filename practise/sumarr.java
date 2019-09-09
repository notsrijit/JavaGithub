import java.util.Scanner;


class SumAvgArr{
    int arr[];
    int l;
    int s;
    SumAvgArr(int len){
        arr = new int[len];
        l = len;
        s =0;
    }

    void setInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter "+l+" elements");
        for (int i =0;i<l;i++){
            arr[i] = sc.nextInt();
            s = s+arr[i];
        }
    }

    int getSum(){
        return s;
    }

    double getAvg(){
        return (s/l);
    }
}

class SumAvgArrDriver{

    public static void main(String[] args) {
        SumAvgArr obj = new SumAvgArr(3);
        obj.setInput();
        System.out.println("Sum of array is "+ obj.getSum());
        System.out.println("Avg of array is "+obj.getAvg());
    }
}