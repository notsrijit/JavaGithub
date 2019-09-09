class Search{
    int arr[];
    int l;
    Search(int a[]){
        arr = a;
        l =arr.length;
    }

    void findElement(int key){
        for(int i =0;i<l;i++){
            if(arr[i]==key){
                System.out.printf("Element %d found at position %d \n",key,i+1);
                return;
            }
        }
        System.out.printf("Element %d not found \n",key);
    }
}

class SearchDriver{
    public static void main(String[] args) {
        int a[] = {12,65,1,7,47,12};
        Search search = new Search(a);
        search.findElement(47);
        search.findElement(13);
    }
}