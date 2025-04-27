package com.bramhesh;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Bramhesh";
        char target = 'H';
        System.out.println(search2(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        char charToFind = Character.toLowerCase(target);

        for (char ch: str.toCharArray()) {
            if (Character.toLowerCase(ch) == charToFind) {
                return true;
            }
        }

        return false;
    }

    static boolean search (String string, char target) {
        if (string.isEmpty()) { // string.length() == 0
            return false;
        }

        for (int i = 0; i < string.length(); i++ ) {
            if (Character.toLowerCase(target) == string.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
