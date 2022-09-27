public class App {
    public static void main(String[] args) throws Exception {
        // Number List
        int num1 = 0;
        int num2 = 25;
        int num3 = 2;

        int biggerNum;
        if (num2 <= num1 && num3 <= num1) {
            biggerNum = num1;
        } else if (num1 <= num2 && num3 <= num2) {
            biggerNum = num2;
        } else {
            biggerNum = num3;
        }
        System.out.println(biggerNum);
    }
}
