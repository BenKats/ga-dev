package example2;

public class Demo extends MyClass {
    public void display2(){
        System.out.println("D2");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        d.display2();;
    }

}
