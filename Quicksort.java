package algorithms;

/**
 * Aauthor cytian
 * Created 2016-08-22
 */
public class Quicksort {

    public static void main(String[] args) {
        Quicksort q = new Quicksort();
        int a[] = {2, 8, 7, 1, 3, 5, 6 ,4};
        q.quicksort(a, 0, a.length-1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public void quicksort(int a[], int p, int r)
    {
        if (p < r) {
            int q = partition(a, p ,r);
            quicksort(a, p, q-1);
            quicksort(a, q+1, r);
        }
    }

    private int partition(int a[], int p, int r)
    {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                exchange(a, i, j);
            }
        }
        exchange(a, i+1, r);
        return i + 1;
    }

    private void exchange(int a[], int ind1, int ind2)
    {
        int temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
}
