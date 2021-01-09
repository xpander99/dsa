public class Stack {
    private int[] arr;
    private int top;
    private int cap;

    public Stack(int cap){
        this.cap = cap;
        this.arr = new int[cap];
        this.top = -1;
    }

    public void push(int element){
        if(top == cap - 1){
            System.out.println("The stack is full.");
            return;
        }
        arr[++top] = element;
    }

    public void pop(){
        if(top == -1){
            System.out.println("The stack is empty.");
            return;
        }
        top--;
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
