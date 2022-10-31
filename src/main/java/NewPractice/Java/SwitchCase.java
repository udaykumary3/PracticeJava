package NewPractice.Java;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();
        sc.switchCase(3);
        sc.switchExample("a");
    }

    public void switchCase(int day){
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
    }

    public void switchExample(String vowel){
        switch(vowel){
            case "a":
                System.out.println("A is entered");
                break;
            case "b":
                System.out.println("B is entered");
                break;
            default:
                System.out.println("out of switch");
        }
    }
}
