package NewPractice.Java;

public class StringIndex {
    public static void main(String[] args) {
        String am = "the quick brown fox jumps over the lazy dog";
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(am.indexOf(ch));
        }
    }
}
