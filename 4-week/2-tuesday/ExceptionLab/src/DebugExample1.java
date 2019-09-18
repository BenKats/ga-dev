public class DebugExample1 {
////    public static void main(String[] args) {
//////        printSomething(null);
//////    }
//////
//////    public static void printSomething(String s){
//////        System.out.println(s);
//////        System.out.println(s.length());
//////    }
////
////
////    public static void main(String[] args) {
////        int[] arr = {};
////        printSomething(arr);
////    }
////
////    public static void printSomething(int arr[]){
////        System.out.println(arr[0]);
////    }

    public static void main(String[] args) {
        int[] grades = {1,2,1,2,1,1,2,1,1};

        for (int x = 0; x < grades.length; x++){
            System.out.println(grades[x]);
        }
    }
}
