
package com.bramhesh;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        NextGreatestLetter solution = new NextGreatestLetter();
        char result = solution.nextGreatestLetter(letters, target);

        System.out.println("Next greatest letter after '" + target + "' is: " + result);

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length]; //handles condition of returning the first as they are wrap arround
    }
}