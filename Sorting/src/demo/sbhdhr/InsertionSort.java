package demo.sbhdhr;

public class InsertionSort {

    public static <T extends Comparable<T>> void sort(T[] a) {
        sort(a, false);
    }

    public static <T extends Comparable<T>> void sort(T[] a, boolean desc) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < a.length; firstUnsortedIndex++) {
            T newElement = a[firstUnsortedIndex];
            int i;
            if (desc){
                for (i = firstUnsortedIndex; (i > 0) && (a[i - 1].compareTo(newElement) < 0); i--) {
                    a[i] = a[i - 1];
                }
            }else {
                for (i = firstUnsortedIndex; (i > 0) && (a[i - 1].compareTo(newElement) > 0); i--) {
                    a[i] = a[i - 1];
                }
            }
            a[i]=newElement;
        }
    }
}
