package ch02;

import java.util.Arrays;

public class Q2 {

    public static void swap(int[] arr,int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }

    public static void reverse(int[] arr) {

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {

            System.out.println("a[" + i + "]와 a[" + (arr.length - i - 1) + "]을 교환합니다.");
            swap(arr, i, arr.length - i - 1);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("역순 정렬을 마쳤습니다");
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1 , 3 ,9, 6, 7};
        reverse(arr);
    }
}
