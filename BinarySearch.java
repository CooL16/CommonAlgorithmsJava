import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        bSearch(numbers, 5);
        squareBruteForce(9);
        squareBseacrh(9);
    }
    static int bSearch(ArrayList<Integer> numbers, int value) {

        int size = numbers.size();
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (value == numbers.get(mid)) {
                System.out.println("Value " + value + " is located at index of " + mid);
                return 0;
            } else if (value > numbers.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 1;
    }

    static void squareBruteForce(double a) {

        double epcilon = 0.01;
        int numGuesses = 0;
        double ans = 0.0;

        while (Math.abs(Math.pow(ans, 2) - a) >= epcilon) {
            ans += 0.000001;
            numGuesses += 1;
        }

        if (Math.abs(Math.pow(ans, 2) - a) >= epcilon)
            System.out.println("failed... " + numGuesses);
        else
            System.out.println(ans + " close to square root of " + a + " with " + numGuesses + " number of guesses ");
    }

    static void squareBseacrh(double a) {

        double epcilon = 0.01;
        double low = 0.0;
        double high = a;
        int guesses = 0;
        double guess = (high + low) / 2.0;

        while (Math.abs(Math.pow(guess, 2) - a) >= epcilon) {
            if(Math.pow(guess,2) < a)
                low = guess;
            else
                high = guess;
            guess = (high + low) / 2.0;
            guesses += 1;
        }

        System.out.println(guess + " is close enough to square root of " + a + ". Guesses: " + guesses);
    }
}
