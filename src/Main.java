import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayListImplementation list = new ArrayListImplementation(5);

        Random random = new Random();
        for (int i = 0; i < 14; i++) {
            list.add(random.nextInt(10, 100));
        }

        int size = list.size();
        System.out.println("An array size is " + size);

        list.displaying();

        list.remove(9);
        list.displaying();

        list.add(7, 88);
        list.displaying();
    }
}