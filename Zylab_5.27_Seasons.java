import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputMonth;
        int inputDay;
        String season = " ";

        /* Type your code here. */

        inputMonth = scnr.next();
        inputDay = scnr.nextInt();


        if (inputMonth.equals("January") ){
            season = "Winter";

            if ( (inputDay <= 0) || (inputDay >= 32) ){
                season = "Invalid";
            }
        }

        else if (inputMonth.equals("Febuary") ){
            season = "Winter";

            if ( (inputDay <= 0) || (inputDay >= 31) ){
                season = "Invalid";
            }
        }

        else if (inputMonth.equals("March") ){
            if ((inputDay > 0) && (inputDay < 20) ){
                season = "Winter";
            }
            else if ( (inputDay > 19) && (inputDay < 31) ){
                season = "Spring";
            }
            else{
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("April") ){
            season = "Spring";

            if ( (inputDay <= 0) || (inputDay >= 31) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("May") ){
            season = "Spring";

            if ( (inputDay <= 0) || (inputDay >= 32) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("June") ){
            if ( (inputDay >=1) && (inputDay <=20) ){
                season = "Spring";
            }
            else if ( (inputDay >= 21) && (inputDay <= 30) ){
                season = "Summer";
            }
            else{
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("July") ){
            season = "Summer";

            if ( (inputDay <= 0) || (inputDay >= 32) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("August") ){
            season = "Summer";

            if ( (inputDay <= 0) || (inputDay >= 32) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("September") ){
            if ( (inputDay >= 1) && (inputDay <= 20) ){
                season = "Summer";
            }
            else if ( (inputDay >= 21) && (inputDay <= 30) ){
                season = "Autumn";
            }
            else{
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("October") ){
            season = "Autumn";

            if ( (inputDay <= 0) || (inputDay >= 31) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("November") ){
            season = "Autumn";

            if ( (inputDay <= 0) || (inputDay >= 31) ){
                season = "Invalid";
            }
        }

        else if ( inputMonth.equals("December") ){
            if ( (inputDay >= 1) && (inputDay <= 20) ){
                season = "Autumn";
            }
            else if ( (inputDay >= 21) && (inputDay <= 31) ){
                season = "Winter";
            }
            else{
                season = "Invalid";
            }
        }

        else{
            season = "Invalid";
        }

        System.out.println(season);

    }
}

/* All tests passed! */