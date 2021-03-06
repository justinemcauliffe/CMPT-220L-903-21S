package base;

public class LinearRecursion {
    public static int FibRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return FibRecursion(n - 2) + FibRecursion(n - 1);
        }
    }
}
