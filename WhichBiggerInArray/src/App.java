public class App {
    public static void main(String[] args) throws Exception {
        double[] numbers = { 1.4, 1.7, 2.5, 4.5, 1.2, 1.9, 4.5, 7.8, 10.0 };
        double sum = 0;
        double max = numbers[0];
        // Print Every Items in Array
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Item" + (i + 1) + " : " + numbers[i]);

        }
        for (int i = 1; i < numbers.length; i++) {
            // Sum Items in Array
            sum += numbers[i];
        }
        System.out.println("Sum : " + sum);
        for (int i = 1; i < numbers.length; i++) {
            // Check The Biggest Num in Array
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max Number : " + max);

    }
}
