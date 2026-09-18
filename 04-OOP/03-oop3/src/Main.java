public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Deaa", 22, 85);
        Student student2 = new Student("Ahmad", 20, 45);

        student1.displayInfo();

        System.out.println("--------------");

        student2.displayInfo();

        student2.setMark(60);

        System.out.println("After updating the mark:");
        student2.displayInfo();
    }
}