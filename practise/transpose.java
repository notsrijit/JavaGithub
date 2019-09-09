class  Transpose{
    int arr[][],r,c;
    Transpose(int a[][],int i,int j){
        arr = a;
        r =i;
        c =j;
    }

    void printTranspose(){
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++)
                System.out.print(arr[j][i]+"  ");
            System.out.println();
        }
    }
}

class TransposeDriver{
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose transpose = new Transpose(a, 3, 3);
        transpose.printTranspose();
    }
}