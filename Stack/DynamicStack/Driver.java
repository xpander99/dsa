public class Driver {
    public static void main(String[] args){
        DynamicStack dynamicStack = new DynamicStack();
        int size = 10;
        for(int i = 0;i<size;i++){
            dynamicStack.push(i);
        }
        // should print 9
        System.out.println(dynamicStack.peek());
        dynamicStack.pop();
        // should print 9
        System.out.println(dynamicStack.size());
        // should print false
        System.out.println(dynamicStack.isEmpty());
        // should print 8
        System.out.println(dynamicStack.peek());
    }
}
