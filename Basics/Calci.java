package Basics;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true){
            //Operator as input
            System.out.println("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else
                System.out.println("Invalid Operator");

            System.out.println(ans);
        }

    }
}
