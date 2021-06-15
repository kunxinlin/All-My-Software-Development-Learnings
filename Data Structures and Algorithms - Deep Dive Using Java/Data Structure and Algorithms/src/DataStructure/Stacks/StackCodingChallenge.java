package DataStructure.Stacks;


import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;

//determine whether a string a palindrome using a stack
//ignore case, white spaces, and punctuation
public class StackCodingChallenge {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string){
        char[] chs = string.replaceAll("\\s", "").replaceAll("\\W", "").toLowerCase().toCharArray();
        String temp = String.valueOf(chs);

        Stack<Character> stack = new Stack<>();

        for(char ch: chs){
            stack.push(ch);
        }

        String rev = "";
        while(!stack.isEmpty()){
            rev+= stack.pop();
        }

        return rev.equals(temp);
    }
}
