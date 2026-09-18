public class Ground extends Vehicle{
    private String type;
    private String model ;
    private double price;


    public Ground(String name,String type2, String model2 , double price2) {
        super(name);
        this.type = type2;
        this.model = model2;
        this.price = price2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String place) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printGround(){
        printVehicle();
        System.out.println("The Type: " + type);
        System.out.println("The Model: " + model);
        System.out.println("The Price: " + price);
    }
}
