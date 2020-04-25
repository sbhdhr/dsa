package demo.sbhdhr;

public class ShellSort {

    public static <T extends Comparable<T>> void sort(T[] a) {
        sort(a, false);
    }

    public static <T extends Comparable<T>> void sort(T[] a, boolean desc) {

        for (int gap = a.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < a.length; i++) {
                T newElement = a[i];
                int j;
                if (desc) {
                    for (j = i; (j >= gap) && (a[j - gap].compareTo(newElement) < 0); j -= gap) {
                        a[j] = a[j - gap];
                    }
                } else {
                    for (j = i; (j >= gap) && (a[j - gap].compareTo(newElement) > 0); j -= gap) {
                        a[j] = a[j - gap];
                    }
                }
                a[j] = newElement;
            }
        }
    }
}
