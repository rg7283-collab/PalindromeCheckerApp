public class UseCase14PalindromeCheckerApp {

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
        int end = word.length()-1;

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
        long time1, time2;

        // reverse method
        start = System.nanoTime();
        reverseMethod(word);
        end = System.nanoTime();
        time1 = end - start;

        // two pointer method
        start = System.nanoTime();
        twoPointerMethod(word);
        end = System.nanoTime();
        time2 = end - start;

        System.out.println("Reverse Method Time: " + time1 + " ns");
        System.out.println("Two Pointer Method Time: " + time2 + " ns");

        // comparison
        if(time1 < time2){
            System.out.println("Reverse Method is Faster");
        } else {
            System.out.println("Two Pointer Method is Faster");
        }
    }
}