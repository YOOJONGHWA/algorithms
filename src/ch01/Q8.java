package ch01;

import java.util.Scanner;

public class Q8 {

    static int sumof(int a, int b) {

        int sum = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        int rv = sc.nextInt();
        System.out.println(sumof(lv, rv));
    }
}
