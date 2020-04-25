package demo.sbhdhr;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];

        Random random = new Random();
        //int number = random.nextInt(max - min) + min;
        Arrays.parallelSetAll(arr, e -> random.nextInt(100 + 50) - 50);

        System.out.println("Array of length: " + arr.length);
        for (int e : arr) {
            System.out.print(e + " ");
        }

        //BubbleSort.sort(arr);
        //BubbleSort.sort(arr, true);
        //SelectionSort.sort(arr);
        //SelectionSort.sort(arr,true);

        System.out.println("\n\nArray after sorting::");
        for (int e : arr) {
            System.out.print(e + " ");
        }

    }
}
