public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String model, String  brand , int speed) {
        this.brand = brand;
        this.model = model;

        if (speed >= 0 && speed <= 200){
            this.speed = speed;
        }else {
            this.speed = 0;
        }

    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200){
            this.speed = speed;
        }else
            System.out.println("Speed must be between 0 and 200 ");
    }
    public void accelerate(int amount){
        if (amount <= 0){
            System.out.println("Acceleration amount must be positive");

        } else if (speed + amount > 200) {
            speed = 200;
            System.out.println("Maximum speed is 200");

        }else speed += amount;
    }
    public void brake(int amount){
        if (amount <= 0 ){
            System.out.println("brake amount must be positive");

        } else if (speed - amount < 0) {
            speed = 0;

        }else speed -= amount;
    }
    public void displayInfo(){
        System.out.println("Brak: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Speed: "+ speed);
        System.out.println("_________________________________");
    }

}
