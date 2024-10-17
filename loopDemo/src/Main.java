public class Main {
    public static void main(String[] args) {
        //FOR Loop

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Loop is over.");

        //WHİLE Loop
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i +=3;
        }
        System.out.println("While loop is over");

        //Do While Loop
        int j = 1 ; // Normal While dan farkı do önce en az bir kere çalıştırır ardından şartı kontrol eder
        do {
            System.out.println(j);
            j +=4;
        }while (j<15);
        System.out.println("DO while loop is over");
    }
}