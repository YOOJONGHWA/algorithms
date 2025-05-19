package ch02;

import java.util.Random;

public class Q3 {

    static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = sumOf(arr);
        System.out.println(sum);
    }
}
