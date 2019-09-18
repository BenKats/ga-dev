public class Sum {
    private static double sum(double num1, double num2){
        return num1 + num2;
    }

    private static double subtract(double num1, double num2){
        return num1 - num2;
    }
    private static double multiply(double num1, double num2){
        return num1 * num2;
    }
    private static double divide(double num1, double num2){
        return num1 / num2;
    }
    public static void main(String[] args) {
        double num1 = 213;
        double num2 = 523;
        System.out.println(sum(num1,num2));
        System.out.println(subtract(num1,num2));
        System.out.println(multiply(num1,num2));
        System.out.println(divide(num1,num2));

    }
}
