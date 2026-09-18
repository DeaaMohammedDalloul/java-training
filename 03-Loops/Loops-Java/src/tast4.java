public class tast4 {
    static void main(String[] args) {



        for (int i = 1 ; i <= 10 ; ++i){
            System.out.println("=============================");
            System.out.println("Multiplication of ("+i+")");
            for (int n =1 ; n <= 10 ; ++n){

                int fee= i * n;

                System.out.println("| " + i + " * " +n + " = " + fee + "  |");



            }
            System.out.println("===============================");

        }
    }
}
