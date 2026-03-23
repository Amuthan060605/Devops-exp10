public class App {

    /**
     * Entry point of the application
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    /**
     * Main execution method
     */
    public void run() {
        int number = 5;

        if (isPositive(number)) {
            int result = calculateSquare(number);
            printResult(number, result);
        } else {
            System.out.println("Number must be positive.");
        }
    }

    /**
     * Checks if a number is positive
     * @param number input number
     * @return true if positive
     */
    public boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Calculates square of a number
     * @param number input number
     * @return square value
     */
    public int calculateSquare(int number) {
        return number * number;
    }

    /**
     * Prints the result
     * @param number input number
     * @param result calculated result
     */
    public void printResult(int number, int result) {
        System.out.println("Square of " + number + " is: " + result);
    }
}
