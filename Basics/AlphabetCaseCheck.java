package Basics;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        System.out.println(ch);

        //Case Check:
        if (ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else
            System.out.println("Upper Case");
    }
}