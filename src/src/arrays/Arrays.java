package src.arrays;

public class Arrays {
    public static void arrays(String[] args) {

        int value = 7;

        int[] values;

        values = new int[3];

        System.out.println(values[2]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {1, 2, 4, 5, 77, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
