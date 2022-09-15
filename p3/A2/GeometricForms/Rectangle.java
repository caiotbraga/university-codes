public class Rectangle extends Quadilateral{

    private double side1;
    private double side2;

    public Rectangle(double s1, double s2, double s3, double s4) {
        super(s1, s2, s3, s4);
        this.side1 = s1;
        this.side1 = s3;
        this.side2 = s2;
        this.side2 = s4;
    }

    @Override
    public double calculateArea() {
        return this.side1 * this.side2;
    }
    
}
