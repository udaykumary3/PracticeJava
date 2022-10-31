package NewPractice.Java;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println(characterCount("uuuday"));
    }

    static int characterCount(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            while(i+1  < text.length() && text.charAt(i) == text.charAt(i+1)){
                i++;
                count++;
                break;
            }
        }
        return count;
    }

}