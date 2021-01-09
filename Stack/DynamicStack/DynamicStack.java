import java.util.ArrayList;
public class DynamicStack {
    private ArrayList<Integer> arr = new ArrayList();

    public void push(int element){
        arr.add(element);
    }
    public void pop(){
        if(arr.isEmpty()){
            System.out.println("The Stack is empty.");
            return;
        }
        arr.remove(arr.get(arr.size() - 1));
    }
    public int peek(){
        if(arr.isEmpty()){
            System.out.println("The Stack is empty.");
            return - 1;
        }
        return arr.get(arr.size() - 1);
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
    public int size(){
        return arr.size();
    }

}
