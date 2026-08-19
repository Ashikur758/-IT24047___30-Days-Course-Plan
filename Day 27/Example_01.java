public class Main {

    static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 15, 40, 30};

        System.out.println("Maximum: " + findMax(numbers));
    }
}