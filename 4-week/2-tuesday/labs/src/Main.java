public class Main {
    public static void main(String args[]){
        int[]  arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 40;
        arr[9] = 100;
        System.out.println(arr[2]);
        arr[2] = 100;
        System.out.println(arr[2]);
    }
}
