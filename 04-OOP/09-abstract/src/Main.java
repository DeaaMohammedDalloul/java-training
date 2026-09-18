import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name Vehicle: ");
        String name = in.nextLine();

        Vehicle v1 = new Vehicle(name);

        System.out.println("1: Aerial ");
        System.out.println("2: Ground ");
        System.out.println("3: Watercraft ");
        System.out.println("4: Exit");
        System.out.print("chose type Vehicle: ");
        int cho = in.nextInt();
        in.nextLine();

        switch (cho){
            case 1:
                System.out.println("============= Aerial ============= ");
                System.out.print("Enter Type: ");
                String type = in.nextLine();
                System.out.print("Enter model: ");
                String model = in.nextLine();
                System.out.print("Enter Price: ");
                double price = in.nextDouble();
                Aerial a1 = new Aerial(name , type , model , price);

                System.out.println("\n============= Aerial ============= ");
                a1.printAerial();
                break;
            case 2:
                System.out.println("\n============= Ground ============= ");
                System.out.print("Enter Type: ");
                String type2 = in.nextLine();
                System.out.print("Enter model: ");
                String model2 = in.nextLine();
                System.out.print("Enter Price: ");
                double price2 = in.nextDouble();
                Ground g1 = new Ground(name , type2 , model2 , price2);

                System.out.println("\n============= Ground ============= ");

                g1.printGround();
                break;

            case 3:
                System.out.println("\n============= Watercraft ============= ");
                System.out.print("Enter Type: ");
                String type3 = in.nextLine();
                System.out.print("Enter model: ");
                String model3 = in.nextLine();
                System.out.print("Enter Price: ");
                double price3 = in.nextDouble();
                Watercraft w1 = new Watercraft(name , type3 , model3 , price3);

                System.out.println("\n============= Watercraft ============= ");
                w1.printWatercraft();
                break;
            case 4:
                System.out.println("Exit");
                in.close();
                break;
            default:
                System.out.println("Error Enter ");





        }




    }
}