package NewPractice.Java;

public class SumOfAll {
    public static void main(String[] args) {
        String a = "12345";
        sumOfAl(a);
    }

    private static void sumOfAl(String a) {
        int sum = 0;
        String[] num = a.split("");
        for (String s : num) {
            int singleNumber = Integer.parseInt(s);
            sum = sum + singleNumber;
        }
        System.out.println("total sum :"+ sum);
    }
}
