import java.util.Scanner;

class Matrix {
    int arr[][];
    int r, c;
    Matrix(){

    }

    Matrix(int r, int c) {
        self.r = r;
        self.c = c;
        arr = new int[r][c];
    }

    void setInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+(r*c)+" elements of array");
        for (int i =0;i<r;i++)
            for (int j =0;j<c;j++)
                arr[i][j] = sc.nextInt();
    }

    void add(Matrix a,Matrix b){
        if(a.r == b.r && a.c == b.c){
            r =a.r;
            c =a.c;
            arr = new int[r][c];

            for (int i =0;i<r;i++)
                for (int j =0;j<c;j++)
                    arr[i][j] = a.arr[i][j]+b.arr[i][j];
        }
    }

    void display(){
        System.out.println("Matrix is");
        for (int i =0;i<r;i++){
                for (int j =0;j<c;j++)
                    System.out.println(arr[i][j]+"  ");
                System.out.println();
        }
    }
}

class MatrixDriver{
    public static void main(String[] args) {
        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);
        Matrix C = new Matrix();
        A.setInput();
        B.setInput();
        C.add(A, B);
        C.display();
    }
}