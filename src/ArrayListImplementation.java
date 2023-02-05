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
        return array.length;
    }

    public void displaying() {
        System.out.println(Arrays.toString(array));
    }

    public void remove(int index) {
        int newSize = array.length - 1;
        int[] smallerArray = new int[newSize];

        System.arraycopy(array, 0, smallerArray, 0, index);
        System.arraycopy(array, index + 1, smallerArray, index, array.length - index - 1);
        array = smallerArray;
    }

    public void add(int index, int value){
        grow();

        System.arraycopy(array, 0, array, 0, index);
        System.arraycopy(array, index, array, index + 1, array.length - index - 1);
        array[index] = value;
    }
}
