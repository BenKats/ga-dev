import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] primeNumbers = {5,3,11,10,7,2};
        System.out.println(Arrays.toString(primeNumbers));
        String numbers = Arrays.toString(primeNumbers);
        System.out.println(numbers.getClass());

        Arrays.sort(primeNumbers);
        int indexOf10 = Arrays.binarySearch(primeNumbers, 10);
        System.out.println(indexOf10);
    }
}
