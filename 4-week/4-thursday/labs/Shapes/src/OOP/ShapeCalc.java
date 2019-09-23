package OOP;

public class ShapeCalc {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle (4,6);
        Circle circle = new Circle(4);
        Square square = new Square(4);

        getCircumferenceAndArea(triangle);
        getCircumferenceAndArea(rectangle);
        getCircumferenceAndArea(circle);
        getCircumferenceAndArea(square);

    }

    private static String getCircumferenceAndArea(Shape shape){
        String ans = "The Circumference of this shape is: " + shape.getCircumference() + " The Area is: " + shape.getArea();
        System.out.println(ans);
        return ans;
    }
}
