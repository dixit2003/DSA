package Basics;

public class ReverseNum {
    public static void main(String[] args) {
        int ans = 0;
        int n = 12345678;
        while (n > 0){
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
