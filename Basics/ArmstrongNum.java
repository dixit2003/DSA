package Basics;


public class ArmstrongNum {
    static boolean isArmstrong(int n){
        int digits = 0;
        int temp = n;
        int sum = 0;
        while (temp > 0){
            temp /= 10;
            digits += 1;
        }
        temp = n;
        while (n > 0){
           int r = n % 10;
           sum = (int) (sum + Math.pow(r, digits));
           n /= 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
    }
}
