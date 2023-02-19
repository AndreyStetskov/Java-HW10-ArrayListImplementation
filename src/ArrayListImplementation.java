import java.util.Arrays;

public class ArrayListImplementation {
    int[] array;
    private int size;

    public ArrayListImplementation(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (array.length == size) {
            grow();
        }

        array[size] = value;
        size++;
    }

    private void grow() {
        int newSize = array.length + 1;
        int[] biggerArray = new int[newSize];

        System.arraycopy(array, 0, biggerArray, 0, array.length);
        array = biggerArray;
    }

    public int size() {
        return size;
    }

    public void displaying() {
        System.out.print("[");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[size - 1]);
        System.out.println("]");
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        size --;
    }

    public void add(int index, int value){
//        your comment: "public void add(int index, int value){
//            grow(); - почему grow вызывается всегда? Всегда будем при add в два раза расти?"
//        My array grows by 1, not twice. Is it bad to do that?
            if (array.length == size) {
            grow();
        }

        System.arraycopy(array, index, array, index + 1, array.length - index - 1);
        array[index] = value;
        size++;
    }
}
