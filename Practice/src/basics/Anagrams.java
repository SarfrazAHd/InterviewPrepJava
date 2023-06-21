package basics;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("geekgeeks","eeksgeekg"));
        System.out.println(isPalindrome("noon"));

    }

    static boolean isAnagram(String str1,String str2){
        char [] str1CharArr = str1.toCharArray();
        Arrays.sort(str1CharArr);

        str1 = String.valueOf(str1CharArr);

        char [] str2CharArr = str2.toCharArray();
        Arrays.sort(str2CharArr);

        str2 = String.valueOf(str2CharArr);

        if (str1.equals(str2)) {
            System.out.println("both are angrams..");
            return true;
        }
        System.out.println("not anagram..");
        return false;
    }

    static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (reversed.equals(str)) return true;
        return false;
    }
}
