//Easy -----> Example 1
////Question---->
//Given a string s consisting of words and spaces, return the length of the last word in the string.A word is a maximal substring consisting of non-space characters only.

import java.util.Scanner;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int n = s.length() - 1;

        while (n >= 0 && s.charAt(n) == ' ') {
            n--;
        }

        // Count the length of the last word
        while (n >= 0 && s.charAt(n) != ' ') {
            length++;
            n--;
        }

        return length;
    }

    public static void main(String[] args) {
        //input
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        int result = lengthOfLastWord(str);
        System.out.println(result);
    }
}
