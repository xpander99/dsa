public class DynamicArray<T> {
    private T[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("The capacity cannot be negative!");
        this.capacity = capacity;
        this.length = 0;
        this.arr = (T[]) new Object[capacity];
    }

    public DynamicArray() {
        this(16);
    }

    public int size() {
        return this.length;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T element) {
        arr[index] = element;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            arr[i] = null;
        }
        length = 0;
    }

    public void add(T element) {
        if (length == capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        arr[length++] = element;
    }

    public T removeAt(int index) {
        if (index >= length && index < 0)
            throw new IndexOutOfBoundsException();
        T element = arr[index];
        T[] newArray = (T[]) new Object[arr.length - 1];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i == index)
                j--;
            else
                newArray[j] = arr[i];
        }
        arr = newArray;
        capacity = --length;
        return element;
    }

    public boolean remove(T element) {
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(element)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element) {
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

}
