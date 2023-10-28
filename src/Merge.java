public class Merge {
    void merge(int[] array, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] arrayLeft = new int[n1];
        int[] arrayRight = new int[n2];

        for (int i = 0; i < n1; ++i)
            arrayLeft[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            arrayRight[j] = array[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (arrayLeft[i] <= arrayRight[j]) {
                array[k] = arrayLeft[i];
                i++;
            }
            else {
                array[k] = arrayRight[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = arrayLeft[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayRight[j];
            j++;
            k++;
        }
    }
    void sort(int[] array, int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }
}

