public class Aerial extends Vehicle {
    private String type;
    private String model ;
    private double price;
//    private String Place;


    public Aerial(String name, String type ,String model , double price ) {
        super(name);
        this.type = type;
        this.model = model;
        this.price = price;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
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

    public void printAerial(){
        printVehicle();
        System.out.println("The Type: " + type);
        System.out.println("The Model: " + model);
        System.out.println("The Price: " + price);
    }



}


