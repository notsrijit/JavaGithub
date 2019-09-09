class SumEven{
    int arr[],l;
    SumEven(int a[]){
        arr = a;
        l = arr.length;
    }

    void findEvenSum(){
        int sum =0;
        for(int i =0;i<l;i++){
            if(arr[i]%2==0)
                sum+=arr[i];
        }

        System.out.println("Sum of Even numbers "+sum);
    }
}

class SumEvenDriver {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};
        SumEven sumEven = new SumEven(a);
        sumEven.findEvenSum();
    }
}