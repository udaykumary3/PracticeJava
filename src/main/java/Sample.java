import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        listimplement(5);
        pattern(4);
    }

    static void listimplement(int n){

        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern(int n){
        System.out.println();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

/*
     *
    * *
   * * *
  * * * *
 * * * * *

 */