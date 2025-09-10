package Step_9_Arrays_I.Easy;

public class LargestElementInAnArray {
    public static int largest(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i : arr) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 7, 56, 90 };
        int[] arr2 = { 5, 5, 5, 5 };
        int[] arr3 = { 10 };

        //
        printArray(arr1);
        System.out.println("Largest Element in Arr1 => " + largest(arr1));

        System.out.println();

        printArray(arr2);
        System.out.println("Largest Element in Arr2 => " + largest(arr2));

        System.out.println();

        printArray(arr3);
        System.out.println("Largest Element in Arr3 => " + largest(arr3));
    }

}
