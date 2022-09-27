public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[] { 1, 2, 4, 5, 7, 8, 9 };
        int searchNum = 5;
        boolean isIn = false;

        for (int num : numbers) {
            if (num == searchNum) {
                isIn = true;
                break;
            }
        }

        if (isIn) {
            System.out.println(searchNum + " in the array");
        } else {
            System.out.println(searchNum + " is not in the array");

        }
    }
}
