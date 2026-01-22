package DataStructures;

import java.util.Arrays;

public class SortingAlgorithms {

    // Merge Sort
    public static void mergeSort(Patient[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Patient[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Patient[] L = new Patient[n1];
        Patient[] R = new Patient[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].getId() <= R[j].getId()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Radix Sort for IDs
    public static void radixSort(Patient[] arr) {
        if (arr.length == 0) return;
        int max = getMaxId(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static int getMaxId(Patient[] arr) {
        int max = arr[0].getId();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getId() > max) max = arr[i].getId();
        }
        return max;
    }

    private static void countSort(Patient[] arr, int exp) {
        int n = arr.length;
        Patient[] output = new Patient[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i].getId() / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i].getId() / exp) % 10] - 1] = arr[i];
            count[(arr[i].getId() / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
