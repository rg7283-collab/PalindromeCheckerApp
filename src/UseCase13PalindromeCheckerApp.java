public class UseCase13PalindromeCheckerApp {

    // reverse method
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // two pointer method
    public static boolean twoPointerMethod(String word) {

        int start = 0;
        int end = word.length() - 1;

        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long start, end;

        // reverse method timing
        start = System.nanoTime();
        reverseMethod(word);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        // two pointer timing
        start = System.nanoTime();
        twoPointerMethod(word);
        end = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (end - start) + " ns");

    }
}