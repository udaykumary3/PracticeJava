package NewPractice;

public class StarPatterns {
    public static void main(String[] args) {
//        ascendingStar(5);
//        descendingStar(5);
//        equilateralTriangle(5);
//        diamondShape(5);
        mirrorRightTriangle(5);
    }

    static void ascendingStar(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void descendingStar(int row){
        for (int i= row-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void equilateralTriangle(int row){
        for (int i=0; i<row; i++)
        {
            for (int j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondShape(int row){
        int space = row -1;
        int i,j;
        for (j = 1; j<= row; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void mirrorRightTriangle(int n){
        for (int i= 0; i<= n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}




