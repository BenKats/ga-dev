//create a new project called "Main"
//        create a new Java class called "Main"
//        paste this inside:
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Nothing in the main method will be tested
    }
    /**
     * Question 1: Find the smallest and largest numbers in an array
     *
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the largest and smallest.
     *
     * You MAY ONLY use arrays, not other collections types (ie Lists).
     *
     * YOU CAN'T USE A SORTING METHOD BUILT INTO JAVA
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
//            System.out.println(max + " " + min);

        }
        return new int[]{min, max};
    }
    /**
     * Question 2: Remove duplicates from an array
     *
     * You are given an array of ints that might have duplicates. You must remove any duplicates from the array,
     * and return an array that doesn't contain duplicates. The order of the elements in the original array
     * does not need to be kept the same.
     *
     * You MAY use any collections types you wish, but the method must return an array.
     *
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param array An array of ints that may or may not include duplicates
     * @return An array of ints that doesn't contain duplicates.
     */
    public static Object[] removeDuplicatesFromArray(int[] array){
        HashSet<Integer> set = new HashSet<Integer>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        Object[] noDupeArr = set.toArray();
        System.out.println("Array as String " + Arrays.toString(array));
        System.out.println("Set: " + set);
        System.out.println("No DUplicate Array: " + Arrays.toString(noDupeArr));
        return noDupeArr;
    }
    /**
     * Given an array of integers, return the sum of the two largest values.
     *
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * YOU CAN'T USE A SORTING METHOD BUILT INTO JAVA
     *
     * @param array An array of integers of any size.
     * @return Sum of the two largest values
     */
    public static int sumOfTwoLargest(int[] array){
       if (array.length == 0){
           return 0;
       } else if (array.length == 1){
           return array[0];
       }else if (array.length == 2){
           return array[0] + array[1];
       }
       int max1 = array[0];
       int max2 = array[0];
       for (int num : array){
           max2 = max1;
           max1 = Math.max(max1, num);
       }
       return max1 + max2;
    }
    //BONUS QUESTION IS BELOW
    /**
     * BONUS:
     *
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     *
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     *
     * For example:
     *      array1 = [1,4,7,9,0,0,0]
     *      array2 = [1,5,11]
     *      returned array = [1,1,4,5,7,9,11]
     *
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static Integer[] mergeSortedArrays(Integer[] array1, Integer[] array2){
        ArrayList<Integer> merged = new ArrayList<Integer>();
       int point1 = 0;
       int point2 = 0;
       while (array1.length > point1 && array2.length > point2) {
           if (array1[point1] < array2[point2]){
               merged.add(array1[point1]);
               point1++;
           }else{
               merged.add(array2[point2]);
               point2++;
           }
       }

        //handles leftovers in an array
       if (array1.length > point1){
           for (int i = point1; i < array1.length; i++) {
               merged.add(array1[i]);
           }
       } else if(array2.length > point2){
           for (int i = point2; i < array2.length; i++) {
               merged.add(array2[i]);
           }
       }

        Integer[] ans = merged.toArray(new Integer[merged.size()]);
        for(Integer s : ans){
            System.out.println(s);
        }
        System.out.println();

        return ans;
    }
}