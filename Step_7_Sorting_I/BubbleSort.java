package Step_7_Sorting_I;

public class BubbleSort {

    private static void helperSelectionSortFun(int[] arr) {
        boolean isSwapped = false;
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 9, 8, 8, 7, 6, 5, 4, 3, 2, 1 };
        SelectionSort.printArr(arr);
        helperSelectionSortFun(arr);
        SelectionSort.printArr(arr);
    }

}
