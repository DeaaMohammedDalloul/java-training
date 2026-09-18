public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
       setPrice(price);
       setQuantity(quantity);
    }
    public double getTotalPrice(){
        return price * quantity;
    }
    public void printfull(){
        System.out.println("the name: " + name);
        System.out.println("the price: " + price);
        System.out.println("the quantity: " +quantity );
        System.out.println("the total: " +  getTotalPrice());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0){
            this.price = price;

        }else {
            System.out.println("Invalid price");
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0 ){
            this.quantity = quantity;

        }else {
            System.out.println("Invalid price");
        }
    }




}
