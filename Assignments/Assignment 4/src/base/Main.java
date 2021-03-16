package base;

public class Main {

    public static void main(String[] args) {
	  int[] array = {2,4,6,8,10};
	  System.out.println(summation(array));
    }

    static int summation(int[] array){
        int total = 0;
        for (int number: array) {
            total += number;
        }
        return total;
    }
}
