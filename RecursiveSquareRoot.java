/**
 * Created by Dave on 1/19/17.
 */
class RecursiveSquareRoot {

    public static void main(String[] args) {
        System.out.println("Recursive Square Root: " + recursiveSqrt(15));
        System.out.println("Actual Square Root:   " + Math.sqrt(15));
    }

    private static double recursiveSqrt(double x) {
        System.out.println("Test: " + x);
        return test(x, 1);
    }

    private static double test(double x, double g) {

        // are we done yet?
        // this is how we are "creating a base case"

        System.out.println("x/g " + x/g);
        if (closeEnough(x/g, g))
            return g; // we are done

        else
            // guess again
            return test(x, betterGuess(x, g));
    }

    private static boolean closeEnough(double a, double x) {

        // create a margin of error that you want to satisfy for your base case
        System.out.println("a: " + a);
        return (Math.abs(a - x) < .00001);
    }

    private static double betterGuess(double x, double g) {

        // create a new guess
        // take the average of your guess
        System.out.println("Better Guess: " + (g + x/g) / 2);
        return ((g + x/g) / 2);
    }
}
