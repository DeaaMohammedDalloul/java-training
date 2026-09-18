public class Circle extends Shape{
    private int radius;

    public Circle(String name, int eadius) {
        super(name);
        this.radius = eadius;
    }

    @Override
    public void area() {
        double result = Math.PI * Math.pow(radius , 2);
        System.out.printf("Circle is area %.3f " , result);
    }
}
