package NewPractice.Java;


public class ArmStrong {
    public static void main(String[] args) {
        ArmStrong ar = new ArmStrong();
        ar.armStrongNumber(153);
    }

    public void armStrongNumber(int number) {
        int sum = 0;
        int rem;
        int temp = number;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("number is armStrong number");
        } else {
            System.out.println("number is not armStrong number");
        }
    }
}
