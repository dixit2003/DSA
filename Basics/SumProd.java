package Basics;

public class SumProd {
    public static void main(String[] args) {
        int n = 544;
        int sum = 0;
        int prod = 1;
        while (n > 0){
            int temp = n % 10;
            sum = sum + temp;
            prod = prod * temp;
            n /= 10;

        }
        System.out.println(prod - sum);
    }
}
