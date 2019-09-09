class Stack {
    int arr[],l,p;
    
    Stack(int len){
        arr = new int[len];
        l = len;
        p =-1;
    }

    void display(){
        if (p <0){
            System.out.println("Stack Empty");
            return;
        }
        for (int i =0;i<=p;i++)
            System.out.print(arr[i]+"  ");
        
        System.out.println();
    }

    void push(int element){
        if(p+1==l){
            System.out.println("Stack Overflow");
            return;
        }
        p++;
        arr[p] = element;
    }

    int pop(){
        if (p<0){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[p--];
    }
}

class StackDriver{
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.display();
        stack.push(1);
        stack.push(2);
        stack.display();
        System.out.println("Pop element "+stack.pop());
        stack.display();
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}