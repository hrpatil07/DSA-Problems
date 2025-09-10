package Step_9_Arrays_I.Medium;

public class SetMatrixZeros {

    private static void better(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int[] row = new int[rowLength];
        int[] col = new int[colLength];

        for (int r = 0; r < rowLength; r++) {
            for (int c = 0; c < colLength; c++) {
                if (arr[r][c] == 0) {
                    row[r] = 1;
                    col[c] = 1;
                }
            }
        }

        for (int r = 0; r < rowLength; r++) {
            for (int c = 0; c < colLength; c++) {
                if (row[r] == 1) {
                    arr[r][c] = 0;
                }
                if (col[c] == 1) {
                    arr[r][c] = 0;
                }
            }
        }

    }

    private static void brute(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (arr[row][col] == 0) {
                    convertValuesToZero(arr, row, col);
                }
            }
        }
        bruteFinalValueUpdate(arr);
    }

    private static void convertValuesToZero(int[][] arr, int updateRow, int updateCol) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        for (int col = 0; col < colLen; col++) {
            arr[updateRow][col] = -1;
        }
        for (int row = 0; row < rowLen; row++) {
            arr[row][updateCol] = -1;
        }

    }

    private static void print2DArr(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void bruteFinalValueUpdate(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (arr[row][col] == -1) {
                    arr[row][col] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        better(arr);
        print2DArr(arr);

        int[][] arr2 = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 },
        };
        better(arr2);
        print2DArr(arr2);

    }

}
