package core.basesyntax;

public class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "height=" + height
                + ", width=" + width
                + ", color='" + getColor() + '\''
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " height: " + height
                + " width: " + width
                + " color: " + getColor());
    }
}