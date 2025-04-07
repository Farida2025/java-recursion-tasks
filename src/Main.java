
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("EXERCISE1, Input number for array and Fill the array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        exercise1(n1, arr1);


        System.out.println("EXERCISE2, Input number for array and Fill the array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        exercise2(n2, arr2);


        System.out.println("EXERCISE3, Input number: ");
        int n3 = sc.nextInt();
        exercise3(n3);


        System.out.println("EXERCISE4, Input number: ");
        int n4 = sc.nextInt();
        System.out.println("(N!) Answer of fourth problem: " + exercise4(n4));


        System.out.println("EXERCISE5, Input number: ");
        int n5 = sc.nextInt();
        System.out.println("(FIBONACCI ELEMENT) Answer of fifth problem: " + exercise5(n5));


        System.out.println("EXERCISE6, Input TWO number: ");
        int n6 = sc.nextInt();
        int n62 = sc.nextInt();
        System.out.println("(FINDING 2 NUMBER POWER OF 1 NUMBER) Answer of sixth problem: " + exercise6(n6, n62));


        System.out.println("EXERCISE7, Input number for array and fill the array: ");
        int n7 = sc.nextInt();
        int[] arr7 = new int[n7];
        for (int i = 0; i < n7; i++) {
            arr7[i] = sc.nextInt();
        }
        System.out.println("(ARRAY IN REVERSE) Answer of seventh problem: " + exercise7(n7, arr7));


        System.out.println("EXERCISE8, Input string: ");
        sc.nextLine();
        String n8 = sc.nextLine();
        System.out.println("(IS CONSIST OF ALL DIGITS) Answer of eighth problem: " + exercise8(n8));


        System.out.println("EXERCISE9, Input TWO number(first number must be smaller than second: ");
        int n9 = sc.nextInt();
        int n92 = sc.nextInt();
        System.out.println("(BINOMIAL COEFFICIENT)Answer of ninth problem: " + exercise9(n9, n92));


        System.out.println("EXERCISE10, Input TWO number: ");
        int n10 = sc.nextInt();
        int n102 = sc.nextInt();
        System.out.println("(GCD)Answer of tenth problem: " + exercise10(n10, n102));
        sc.nextLine();


        //BONUS EXERCISES
        System.out.println("EXERCISE11, Input TWO STRINGS WITH SAME SIZE: ");
        String n11 = sc.nextLine();
        String n112 = sc.nextLine();
        System.out.println("(MINGLE STRINGS) Answer of 11 problem: " + exercise11(n11, n112));

        //BONUS EXERCISES
        System.out.println("EXERCISE12, Input one number and such strings(R, G, Y, B): ");
        int n12 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n12; i++) {
            String s = sc.nextLine();
            System.out.println("Answer of 12 problem: " + exercise12(s));
        }


    }


    /**
     * This method finds the minimum number in a given integer array.
     * It uses a simple linear search approach by iterating through the array once.
     * Time complexity: O(n), where n is the size of the input array.
     * The algorithm checks each element exactly once, resulting in linear time.
     *
     * @param n1   The number of elements in the array.
     * @param arr1 The integer array to search through.
     */
    public static void exercise1(int n1, int[] arr1) {
        int min1 = arr1[0];
        for (int i = 1; i < n1; i++) {
            if (min1 > arr1[i]) {
                min1 = arr1[i];
            }
        }
        System.out.println("(MINIMUM NUMBER FROM THE ARRAY) Answer of first problem: " + min1);
    }


    /**
     * This method calculates the average value of the elements in a given integer array.
     * It sums all the elements and then divides the sum by the number of elements.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm makes a single pass through the array to calculate the sum.
     *
     * @param n1   The number of elements in the array.
     * @param arr1 The integer array whose average value is to be calculated.
     */
    public static void exercise2(int n1, int[] arr1) {
        int summ = 0;
        for (int i = 0; i < n1; i++) {
            summ += arr1[i];
        }
        System.out.println("(AVERAGE OF ELEMENTS) Answer of second problem: " + String.format("%.1f", (double) summ / n1));

    }


    /**
     * This method determines whether a given integer is a prime or composite number.
     * It does so by counting how many numbers divide the input number without a remainder.
     * Time complexity: O(n), where n is the input number.
     * The algorithm checks divisibility from 1 to n, which results in linear time.
     *
     * @param n1 The number to check for primality.
     */
    public static void exercise3(int n1) {
        int summ = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                summ++;
            }
        }
        if (summ > 2) System.out.println("(PRIME OR COMPOSITE) Answer of third problem: Composite");
        else System.out.println("(PRIME OR COMPOSITE) Answer of third problem: Prime");
    }


    /**
     * This method calculates the factorial of a given non-negative integer using recursion.
     * Time complexity: O(n), where n is the input number.
     * The recursion calls itself n times until the base case (n <= 0) is reached.
     *
     * @param n1 The number for which the factorial is to be calculated.
     * @return The factorial of the input number.
     */
    public static int exercise4(int n1) {
        if (n1 <= 0) {
            return 1;
        }
        return n1 * exercise4(n1 - 1);
    }


    /**
     * This method calculates the n-th Fibonacci number using a recursive approach.
     * The Fibonacci sequence is defined as:
     * F(0) = 0, F(1) = 1, and F(n) = F(n - 1) + F(n - 2) for n > 1.
     * Time complexity: O(2^n), where n is the input number.
     * The algorithm recalculates subproblems multiple times, resulting in exponential time.
     *
     * @param n1 The index (n) of the Fibonacci number to calculate.
     * @return The n-th Fibonacci number.
     */
    public static int exercise5(int n1) {
        if (n1 == 0) return 0;
        if (n1 == 1) return 1;
        return (exercise5(n1 - 1) + exercise5(n1 - 2));
    }


    /**
     * This method calculates a raised to the power of n (a^n) using recursion.
     * It multiplies the base `a` by itself `n` times until the exponent reaches 0.
     * Time complexity: O(n), where n is the exponent.
     * The algorithm performs one recursive call per decrement of n.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static int exercise6(int a, int n) {
        if (n < 1) {
            return 1;
        }
        return a * exercise6(a, n - 1);
    }


    /**
     * This method returns the given array in reverse order using recursion.
     * It builds the reversed string by taking the last element first and recursively processing the rest.
     * Time complexity: O(n), where n is the number of elements in the array.
     * Each recursive call processes one element, resulting in linear time.
     *
     * @param n1  The number of elements in the array.
     * @param arr The array to be reversed.
     * @return A string representing the array elements in reverse order, separated by spaces.
     */
    public static String exercise7(int n1, int[] arr) {
        if (n1 == 0) return "";
        return arr[n1 - 1] + " " + exercise7(n1 - 1, arr);
    }


    /**
     * This method checks whether a given string consists only of digits using recursion.
     * It examines the first character of the string, and if it is a digit,
     * recursively checks the rest of the string.
     * Time complexity: O(n), where n is the length of the input string.
     * The function processes one character per recursive call, resulting in linear time.
     *
     * @param s The string to check.
     * @return "Yes" if the string consists only of digits, otherwise "No".
     */
    public static String exercise8(String s) {
        if (s.length() == 0) return "Yes";
        if (!Character.isDigit(s.charAt(0))) return "No";
        return exercise8(s.substring(1));
    }


    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     * The binomial coefficient represents the number of ways to choose k elements from a set of n elements.
     * It follows the recursive identity:
     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     * with base cases:
     * - C(n, 0) = 1
     * - C(n, n) = 1
     * - C(n, k) = 0, when k > n
     * Time complexity: O(2^n) in the worst case due to overlapping subproblems.
     * This can be optimized using memoization or dynamic programming.
     *
     * @param k The number of items to choose.
     * @param n The total number of items.
     * @return The binomial coefficient C(n, k).
     */
    public static int exercise9(int k, int n) {
        if (k > n) return 0;
        if (k == 0) return 1;
        if (n == k) return 1;
        return (exercise9(k - 1, n - 1) + exercise9(k, n - 1));
    }


    /**
     * This method calculates the Greatest Common Divisor (GCD) of two integers using
     * the recursive Euclidean algorithm.
     * It is based on the principle that GCD(a, b) = GCD(b, a % b),
     * and GCD(a, 0) = a.
     * Time complexity: O(log(min(a, b))) — very efficient.
     * The algorithm reduces the problem size by a factor in each step.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     */
    public static int exercise10(int a, int b) {
        if (b == 0) return a;
        return exercise10(b, a % b);
    }


    //BONUS EXERCISES


    /**
     * This method mingles two strings of equal length using recursion.
     * The mingling rule requires taking characters alternately from each string.
     * <p>
     * For example, given:
     * a = "abc"
     * b = "xyz"
     * The output will be "axbycz"
     * <p>
     * The method recursively takes the first character of each string
     * and appends them together, then recurses with the rest of the strings.
     * <p>
     * Time complexity: O(n), where n is the length of the input strings.
     * Each recursive call processes one character from each string, resulting in linear time.
     *
     * @param a The first string.
     * @param b The second string (must be the same length as a).
     * @return A new string with characters alternated from both strings.
     */
    public static String exercise11(String a, String b) {
        if (a.length() == 0 && b.length() == 0) return "";
        return a.charAt(0) + "" + b.charAt(0) + exercise11(a.substring(1), b.substring(1));
    }

    //BONUS EXERCISES

    /**
     * This method checks whether a given string of color balls is "full of colors" according to 4 rules:
     * <p>
     * 1. The number of red ('R') balls must be equal to the number of green ('G') balls.
     * 2. The number of yellow ('Y') balls must be equal to the number of blue ('B') balls.
     * 3. In every prefix of the string, the difference between red and green balls must not exceed 1.
     * 4. In every prefix of the string, the difference between yellow and blue balls must not exceed 1.
     * <p>
     * The function iterates over the input string character by character, counts the occurrences of each color,
     * and checks the prefix conditions on the go.
     * <p>
     * Time complexity: O(n), where n is the length of the input string.
     * Space complexity: O(1), since only a few counters are used.
     *
     * @param s The input string consisting of characters 'R', 'G', 'Y', 'B'.
     * @return true if the string satisfies all 4 conditions, otherwise false.
     */

    public static boolean exercise12(String s) {
        int red = 0, green = 0, yellow = 0, blue = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'R') red++;
            else if (ch == 'G') green++;
            else if (ch == 'Y') yellow++;
            else if (ch == 'B') blue++;
            if (Math.abs(red - green) > 1 || Math.abs(yellow - blue) > 1) {
                return false;
            }
        }
        return red == green && yellow == blue;
    }
}