public class Student {
    private String name;
    private int id;
    private double mark;

    public Student(String name, int id, double mark) {
        this.name = name;
        this.id = id;
        setMark(mark);

    }

    public void printfull(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Mark: " + mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {

        if (mark >= 50 && mark <= 100){
              this.mark = mark;
        } else if (mark <50) {
            System.out.println("Invalid mark ");
               this.mark = 0;
        }


    }
}
