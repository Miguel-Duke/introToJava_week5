import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scan = new Scanner(System.in);

        int input1;
        int input2;
        int input3;
        int rnd2;
        int round2;
        int fin;

        input1 = scan.nextInt();
        input2 = scan.nextInt();
        input3 = scan.nextInt();

        rnd2 = (input1 > input2) ? input2:input1;
        round2 = (input2 > input3) ? input3:input2;
        fin = (rnd2 > round2) ? round2:rnd2;

        System.out.println(fin);
    }
}
/* Passed all tests! */