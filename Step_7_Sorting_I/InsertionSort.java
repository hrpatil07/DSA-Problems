package Step_7_Sorting_I;

public class InsertionSort {

    private static void helperInsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 3, 66, 321, 2, 5 };

        SelectionSort.printArr(arr);
        helperInsertionSort(arr, arr.length);
        SelectionSort.printArr(arr);
    }

}
