package OOP;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getCircumference(){
        return side1 + side2 + side3;
    }

    @Override
    public double getArea(){
        double perimeter = getCircumference()/2;
       double heroFormula= Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2*(perimeter-side3)));
        return heroFormula;
    }
}
