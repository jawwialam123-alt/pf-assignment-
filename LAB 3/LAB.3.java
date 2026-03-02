class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // Return max between two numbers
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Return max among three numbers
    int max(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    // Main method
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Integer addition
        System.out.println("Add integers: " + calc.add(5, 10));

        // Double addition
        System.out.println("Add doubles: " + calc.add(5.5, 2.3));

        // Max between two numbers
        System.out.println("Max of two: " + calc.max(8, 3));

        // Max among three numbers
        System.out.println("Max of three: " + calc.max(4, 9, 6));
    }
}