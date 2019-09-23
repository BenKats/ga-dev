package example.interface1;

public class Demo implements MyInterface{


    public void method1() {
        System.out.println("Implement Method 1");

    }


    public void method2() {
        System.out.println("Implement Method 2");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
        d.method2();
    }
}
