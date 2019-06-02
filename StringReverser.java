import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original;
        String reverse = "";

        System.out.println("Enter smth...");
        original = scanner.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Your reversed string is: " + reverse);
    }
}
