import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        LinkedList<Character> list = new LinkedList<>();

        // add characters to linked list
        for(char c : word.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare first and last
        while(list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}