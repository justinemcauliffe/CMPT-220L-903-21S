package base;

public class Head {
    public static int fib(int n)
    {

        if (n > 2) {
            return fib(n - 2) + fib(n - 1);
        } else if (n == 0) {
            return 0;
        } else{
        return 1;
    }

}}
