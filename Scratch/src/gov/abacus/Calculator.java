package gov.abacus;

/*
 * This is "all-static" class, i.e., a class definition with nothing
 * but static methods. These are called from the client as Calculator.methodName().
 */
class Calculator {

    /*
     * Returns the arithmetic mean (average) of the supplied integers.
     * average
     */
    public static double average(int first, int... rest) {  // 2, 6, 6, 5  (sum is 19)
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value;  // sum = sum + value
        }

        result = sum / (rest.length + 1);
        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns a random integer between 1 and 14 (inclusive).
     * <p>
     * HINT: see a class called Math in the Java API (package java.lang).
     * Look for a helpful method here to get you started.
     * NOTE: these methods in the Math class are all "static," which means you call them as so:
     * Math.methodName()
     */
    public static int randomInt() {
        return randomInt(1, 14); // delegate to one below
    }

    /**
     * Returns a random integer between 'min' and 'max' (inclusive).
     */
    public static int randomInt(int min, int max) {    // e.g., 5 to 75
        double rand = Math.random();
        double scaled = (rand * max) + min;

        int result = (int) scaled;

        return result;
    }
}