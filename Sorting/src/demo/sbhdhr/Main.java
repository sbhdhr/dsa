package demo.sbhdhr;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int[] arr = new int[50];

	    Random random = new Random();
        //int number = random.nextInt(max - min) + min;
        Arrays.parallelSetAll(arr,e-> random.nextInt(500+100)-100);

        System.out.println("Array of length: "+arr.length);
        for (int e : arr) {
            System.out.print(e + " ");
        }

    }
}
