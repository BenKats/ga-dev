public class Sample {
    public static void main(String args[]){
    for(int i  = 1; i <= 101; i++){
        System.out.println(i);
        if (i % 15 == 0){
            System.out.println("fizzbuzz");
        } else if (i % 3 == 0){
            System.out.println("fizz");
        } else if (i % 5 == 0){
            System.out.println("buzz");
        }
    }


    }
}
