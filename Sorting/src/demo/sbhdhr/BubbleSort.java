package demo.sbhdhr;

public class BubbleSort {

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
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (desc) {
                    if (a[j].compareTo(a[j + 1]) < 0) {
                        swap(a, j, j + 1);
                    }
                } else {
                    if (a[j].compareTo(a[j + 1]) > 0) {
                        swap(a, j, j + 1);
                    }
                }

            }
        }
    }
}
