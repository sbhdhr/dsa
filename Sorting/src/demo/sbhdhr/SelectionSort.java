package demo.sbhdhr;

public class SelectionSort {
    //Unstable

    private static <T> void swap(T[] a, int i, int j) {
        if (i == j)
            return;
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T extends Comparable<T>> void sort(T[] a) {
        sort(a, false);
    }

    public static <T extends Comparable<T>> void sort(T[] a, boolean desc) {
        for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //T largestVal = a[0];
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (desc) {
                    if (a[i].compareTo(a[largest]) < 0) {
                        largest = i;
                    }
                } else {
                    if (a[i].compareTo(a[largest]) > 0) {
                        largest = i;
                    }
                }
            }
            swap(a, largest, lastUnsortedIndex);
        }
    }
}
