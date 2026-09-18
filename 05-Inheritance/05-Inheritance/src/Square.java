public class Square extends Shape {
    private int width;
    private int height;

    public Square(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        int result = width * height;
        System.out.println("Area of this square is " + result);
    }

}