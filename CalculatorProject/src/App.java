public class App {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();

        int num1 = 5;
        int num2 = 3;
        System.out.println(fourOperations.Sum(num1, num2));
        System.out.println(fourOperations.Minus(num1, num2));
        System.out.println(fourOperations.Times(num1, num2));
        System.out.println(fourOperations.Divide(num1, num2));
    }
}
