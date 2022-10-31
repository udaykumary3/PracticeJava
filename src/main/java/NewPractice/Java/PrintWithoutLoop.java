package NewPractice.Java;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        printWithoutLoop(1);
    }

    public static void printWithoutLoop(int n){
        if(n<=100){
            System.out.println(n);
            printWithoutLoop(n+1);
        }
    }
}
