package Step_5_Basic_Recursion;

// import java.util.*;

public class printNTimes {

    public static void recPrintNTimes(int n, int count) {
        if (n < count) {
            return;
        }
        System.out.println(n + "->" + count);
        recPrintNTimes(n, count + 1);
    }

    public static void main(String[] args) {
        recPrintNTimes(5, 1);
    }

}