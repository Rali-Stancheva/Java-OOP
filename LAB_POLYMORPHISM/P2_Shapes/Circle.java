package OOP.LAB_POLYMORPHISM.P2_Shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
       super.setPerimeter(2 * Math.PI * radius);
       return super.getPerimeter();
    }

    @Override
    Double calculateArea() {
       super.setArea(Math.PI * radius * radius);
       return super.getArea();
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
