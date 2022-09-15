public class Triangle implements Area{
    
    private double base;
    private double height;
    

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }



    @Override
    public double calculateArea() {
        return (this.base * this.height)/ 2;
    }
    
}
