public class Driver {
    public static void main(String[] args){
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(10);
        dynamicArray.add(30);
        dynamicArray.add(40);
        System.out.println(dynamicArray.indexOf(30));
        dynamicArray.remove(40);
    }
}
