class SumDiagonal{
    int arr[][],r,c;
    SumDiagonal(int a[][],int i,int j){
        arr= a;
        r = i;
        c = j;
    }

    void findDiagonalSum(){
        int sum =0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(i==j)
                    sum+=arr[i][j];
        
        System.out.println("Sum of diagonals are "+sum);
    }
}

class SumDiagonalDriver{
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        SumDiagonal diagonal = new SumDiagonal(a, 3, 3);
        diagonal.findDiagonalSum();
    }
}