package ch03;

import java.util.Scanner;

public class Q2 {

    static void fillArray(int[] arr) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            int n = sc.nextInt();
            arr[i] = n;
            System.out.println();
        }
    }

    static void scanProcess(int[] arr) {

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("----------------------------");

        int i = 0;
        while (true) {

            System.out.print(i + "\t");

            System.out.print("*");
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[j] + "\t");
            }

            System.out.println();
            i++;
            if (arr[i] == key) {
                System.out.println("그 값은 arr[" + i + "]에 있습니다");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        fillArray(arr);
        scanProcess(arr);

    }
}
