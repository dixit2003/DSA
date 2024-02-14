package Basics;

public class OccuranceOfNumber {
    public static void main(String[] args) {
        int count = 0;
        int n = 536555435;
        while(n > 0){
            if (n % 10 == 5)
                count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
