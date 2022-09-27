public class App {
    public static void main(String[] args) {
        char word = 'E';

        char[] bass = { 'A', 'I', 'O', 'U' };
        char[] thin = { 'E', 'İ', 'Ö', 'Ü' };
        String which = "thin";

        for (int i = 0; i < bass.length; i++) {
            if (word == bass[i]) {
                which = "bass";
            }
        }

        if (which == "bass") {
            System.out.println("Char is " + which);
        } else {
            System.out.println("Char is " + which);
        }

    }
}
