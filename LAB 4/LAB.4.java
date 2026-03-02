public class PrimeNumber {

    // Function to check prime number
    public static boolean isPrime(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check from 2 to number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;   // Not prime
            }
        }

        return true;   // Prime
    }

    // Main method to test the function
    public static void main(String[] args) {

        int num = 7;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}