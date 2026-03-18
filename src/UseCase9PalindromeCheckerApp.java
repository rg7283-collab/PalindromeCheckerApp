public class UseCase9PalindromeCheckerApp {

    // recursive function
    public static boolean isPalindrome(String word, int start, int end) {

        // base condition
        if(start >= end){
            return true;
        }

        // check characters
        if(word.charAt(start) != word.charAt(end)){
            return false;
        }

        // recursive call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        if(isPalindrome(word, 0, word.length() - 1)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}