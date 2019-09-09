class Range{
    int arr[];
    int l;
    int max,min;
    Range(int a[]){
        arr = a;
        l = arr.length;
        max =0;
        min =0;
    }

    void findRange(){
        max = arr[0];
        min = arr[0];
        for (int i = 0;i<l;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.printf("Range is between %d and %d\n",min,max);
    }
}

class RangeDriver{
    public static void main(String[] args) {
        int a[] = {2,4,6,21,1};
        Range range = new Range(a);
        range.findRange();
    }
}