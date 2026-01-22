package DataStructures;

public class SearchingAlgorithms {

    // Binary Search (Iterative)
    public static int binarySearch(Patient[] arr, int id) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid].getId() == id) return mid;
            if (arr[mid].getId() < id) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Binary Search (Recursive)
    public static int binarySearchRecursive(Patient[] arr, int left, int right, int id) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid].getId() == id) return mid;
            if (arr[mid].getId() > id) return binarySearchRecursive(arr, left, mid - 1, id);
            return binarySearchRecursive(arr, mid + 1, right, id);
        }
        return -1;
    }
}
