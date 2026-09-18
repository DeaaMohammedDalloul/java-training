public class Car extends Vehicle {
    private String model;
    private double price;

    public Car(String brand, int year, String model, double price) {
        super(brand, year);
        this.model = model;
        this.price =  price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 ){
            this.price = price;
        }else {
            System.out.println(" تتهبلش ما بنفع السعر بالسالب  ");
        }

    }
    public void printCar(){
        printVehicle();
        System.out.println("Model: " + model);
        System.out.print("Price: ");
        setPrice(price);


    }

}

