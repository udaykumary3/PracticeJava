package org.javaPractice;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(armStrong(153));

        for(int i=100;i<=999;i++){
            if(armStrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean armStrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n=n/10;
        }
        return sum==original;
    }
}

