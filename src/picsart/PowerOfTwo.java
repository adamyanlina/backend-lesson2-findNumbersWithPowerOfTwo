package picsart;

public class PowerOfTwo {
    public static void main(String[] args) {

        // Lesson 2, Task - Output numbers with exact powers of two

        int[] numbers = {1, 3, 4, 5, 7, 16, 32};

        for (int n = 0; n < numbers.length; n++) {

            // Method 1
            if (numbers[n] == (numbers[n]&-numbers[n])) {
                System.out.println(numbers[n] + " ");
            }

            // Method 2
            if (Integer.bitCount(numbers[n]) == 1) {
                System.out.println(numbers[n] + " ");
            }
        }
    }
}
