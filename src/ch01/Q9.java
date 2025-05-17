package ch01;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a값: ");
        int a = sc.nextInt();

        int b;
        while (true) {
            System.out.print("b값: ");
            b = sc.nextInt();
            System.out.println("a보다 큰값을 입력하세요!");
            if (a < b) break;

        }

        System.out.println("b - a는 " + (b - a) + " 입니다.");
    }
}
