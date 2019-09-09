class ReverseArr{
    int arr[],l;
    ReverseArr(int a[]){
        arr = a;
        l =arr.length;
    }

    void printReverse(){
        for (int i =0;i<(l/2);i++){
            int temp = arr[l-1-i];
            arr[l-1-i] = arr[i];
            arr[i] =temp;
        }

        System.out.println("Reverse array");
        for(int i =0;i<l;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
    }
}

class ReverseArrDriver{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        ReverseArr rArr = new ReverseArr(a);
        System.out.println("Original array");
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+"  ");
        System.out.println();
        rArr.printReverse();
    }
}