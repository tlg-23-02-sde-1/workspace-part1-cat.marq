package gov.research;

import java.util.Arrays;

class ArrayTest {
    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 41;
        ages[1] = 47;
        System.out.println(ages);  // toString()  NOT USEFUL
        System.out.println(Arrays.toString(ages));  // Clean Code

        double[] prices = { 9.99, 37.49, 32.5, 49.96 };
        System.out.println("prices has length" + prices.length);  // Not useful
        System.out.println(Arrays.toString(prices));  // Clean code
        System.out.println();

        String[] names = { "cat", "sunny", "samuel", "lexi"};  // This will print a clean code
        //String[] names = new String[2];  // You will get null and null
        System.out.println(Arrays.toString(names));

        for (String name : names) {
            System.out.println(name);  // This will give each name on the line
        }

    }
}