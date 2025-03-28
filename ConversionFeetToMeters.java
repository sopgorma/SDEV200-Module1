/*
 Sophia Gorman
 SDEV200 - Assignment 6.9
 3/28/2025
 */

public class ConversionFeetToMeters {
    public static void main(String[] args) {
        //Outputs the first strings with the necessary format.
        System.out.printf("%-8s%-10s%10s%8s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-------------------------------------");

        //Feet begins at 1.0 and meters at 20.0. 
        //Increase feet up to 10 and meters increase by 5.0.
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters +=5.0) {

            /*Format the output so that it lines up side by side, with feet and the conversion first,
            (using "-"" for left indentation), then meters and its conversion afterward on the right side.
             */
            System.out.printf("%-8.1f%-10.3f|%8.2f%10.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }

//Adds two methods for calculation within the same class.

/*!! IMPORTANT: I had to add 3.27869 to 
 the meterToFoot equation because adding 
 the rounded 3.279 did not display the 
 correct values as shown on the table in the assignment !!
*/
    public static double meterToFoot(double meters) {
        return meters * 3.27869; 
    }
    public static double footToMeter(double feet) {
        return feet * 0.305;
    }

}