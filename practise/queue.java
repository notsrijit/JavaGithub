class Queue {
    int arr[], l, f, r;

    Queue(int len) {
        l = len;
        arr = new int[len];
        f = -1;
        r = -1;
    }

    void insert(int element){
        if(f == r){
            f = 0;
            r = 0;
        }
        if (r == l){
            System.out.println("Queue Overflow");
            return;
        }
        arr[r] = element;
        r++;
    }

    int pop(){
        if(f == -1){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[f++];
    }

    void display(){
        if (f == -1){
            System.out.println("Queue Empty");
            return;
        }

        for(int i = f;i<r;i++)
            System.out.print(arr[i]+"  ");

        System.out.println();
    }
}

class QueueDriver{
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.display();
        queue.insert(1);
        queue.insert(2);
        queue.display();
        System.out.println("Popped Element "+queue.pop());
        queue.insert(3);
        queue.insert(4);
        queue.display();
        System.out.println("Popped Element "+queue.pop());
        queue.display();
        
    }
}