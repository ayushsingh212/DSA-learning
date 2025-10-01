import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int shift = 2;

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(i + shift) % arr.length];
        }

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Shifted : " + Arrays.toString(result));
    }
}
