public class LargeNum {
    public static void main(String[] args) {
        int myMax = findMax(new int[]{10,212,11,22,12,1,21});
        System.out.println(myMax);

    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
