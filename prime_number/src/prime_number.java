import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for (int i=2; i<=100; i++) {
            int control = 0;
            for (int k=2; k<i; k++) {
                if (i%k==0){
                    control =1;
                    break;
                }
            }
            if (control==0){
                System.out.print(i + "\n");
                counter++;
            }


        }
    }
}
