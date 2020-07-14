import java.util.Scanner;

public class InterstateHighway {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;
        String direction = "unset";
        String auxPri = "unset";
        int serving = -1;

        highwayNumber = scnr.nextInt();

        /* Type your code here. */

        if ( (1000 > highwayNumber) && (highwayNumber > 99) ){
            auxPri = "auxiliary";
            serving = highwayNumber % 100;
        }

        if ( (highwayNumber <= 99)  && (highwayNumber > 0) ){
            auxPri = "primary";
        }

        direction = (highwayNumber % 2 == 1) ? "north/south" : "east/west";

        if (auxPri == "auxiliary"){
            System.out.println("I-" + highwayNumber + " is " + auxPri + ", serving I-" + serving + ", going " + direction + ".");
        }
        else if (auxPri == "primary"){
            System.out.println("I-" + highwayNumber + " is " + auxPri + ", going " + direction + ".");
        }
        else{
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}

/* Passed all tests */