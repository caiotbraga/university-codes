public class CalculateCircleArea implements Area{

    @Override
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
