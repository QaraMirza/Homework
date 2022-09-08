import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 2, 7};
        int sum = 10;
        int j = 0;
        for (int i = 0; i < array.length;) {
            if (array[i] + array[j] == sum) {
                System.out.println(Arrays.toString(array) + ", " + sum + " -> [" + array[i] + ", " + array[j] + "]");
                return;
            }
            if (j == array.length - 1) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }
        System.out.println("Wrong values");
    }
}
