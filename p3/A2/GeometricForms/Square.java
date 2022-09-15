public class Square extends Quadilateral{

    public double side;

    public Square(double s1, double s2, double s3, double s4) {
        super(s1, s2, s3, s4);
        this.side = s1;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }
}
