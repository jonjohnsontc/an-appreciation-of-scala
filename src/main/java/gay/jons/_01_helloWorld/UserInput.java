package gay.jons._01_helloWorld;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, " + sc.next() + "!");
    }
}
