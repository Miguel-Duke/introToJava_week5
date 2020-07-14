import java.util.Scanner;

public class GrayRemoverRGB {
    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scan = new Scanner(System.in);

        int red = 0;
        int green = 0;
        int blue = 0;

        int gray = 0;

        red = scan.nextInt();
        green = scan.nextInt();
        blue = scan.nextInt();

        if (red >= green){
            if (green >= blue){
                gray = blue;
            }
            if (blue > green){
                gray = green;
            }
        }
        else{
            if (red >= blue){
                gray = blue;
            }
            if (blue > red){
                gray = red;
            }
        }

        red = red - gray;
        green = green - gray;
        blue = blue - gray;

        System.out.println(red + " " + green + " " + blue);
    }
}

/* Passed all tests! */