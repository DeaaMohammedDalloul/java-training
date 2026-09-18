public class Student {

        private String name;
        private int age;
        private double mark;

        public Student(String name, int age, double mark) {
            this.name = name;
            this.age = age;
            setMark(mark);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getMark() {
            return mark;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public void setMark(double mark) {
            if (mark >= 0 && mark <= 100) {
                this.mark = mark;
            } else {
                System.out.println("Invalid mark");
            }
        }

        public boolean isPassed() {
            return mark >= 50;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Mark: " + mark);

            if (isPassed()) {
                System.out.println("Result: Passed");
            } else {
                System.out.println("Result: Failed");
            }
        }
    }

