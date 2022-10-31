package NewPractice.Java;

public class StringPalindromeWithoutThirdVariable {
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
    }

    static boolean isPalindrome(String text){
        int i = 0;
        int j = text.length()-1;

        while(i < j){
            if (text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
