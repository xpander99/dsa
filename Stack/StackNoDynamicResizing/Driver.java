public class Driver {
    public static void main(String[] args){
        Stack myStack = new Stack(5);
        System.out.println(myStack.isEmpty());
        myStack.push(10);
        // should print 10
        System.out.println(myStack.peek());
        myStack.push(20);
        // should print 20
        System.out.println(myStack.peek());
        // should print 2
        System.out.println(myStack.size());
        myStack.pop();
        myStack.pop();
        // should print true
        System.out.println(myStack.isEmpty());
        // should print 0
        System.out.println(myStack.size());
        // should print "The stack is empty."
        myStack.pop();
    }
}
