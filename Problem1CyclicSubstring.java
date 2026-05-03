import java.util.*;

public class Problem1CyclicSubstring {

    public static int maxCyclicSubstringSum(String inputString) {

        int n = inputString.length();
        String cyclicString = inputString + inputString;

        Set<Character> uniqueChars = new HashSet<>();

        int leftPointer = 0;
        int currentSum = 0;
        int maximumSum = 0;

        for (int rightPointer = 0; rightPointer < cyclicString.length(); rightPointer++) {

            char currentChar = cyclicString.charAt(rightPointer);

            while (uniqueChars.contains(currentChar)) {
                char leftChar = cyclicString.charAt(leftPointer);

                uniqueChars.remove(leftChar);
                currentSum -= getCharValue(leftChar);

                leftPointer++;
            }

            uniqueChars.add(currentChar);
            currentSum += getCharValue(currentChar);

            if (rightPointer - leftPointer + 1 > n) {
                char leftChar = cyclicString.charAt(leftPointer);

                uniqueChars.remove(leftChar);
                currentSum -= getCharValue(leftChar);

                leftPointer++;
            }

            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }

    public static int getCharValue(char ch) {
        return ch - 'a' + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        int result = maxCyclicSubstringSum(input);

        System.out.println("Maximum Cyclic Substring Sum (Unique Characters): " + result);

        scanner.close();
    }
}
