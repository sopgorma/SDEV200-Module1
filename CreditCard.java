/* Sophia Gorman
 SDEV200 - Assignment 6.31
 3/28/2025
 */

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        //Import scanner and allow user to input credit card number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number with long integers: ");
        long number = input.nextLong();
        
        //Test if number is valid or invalid.
        System.out.println(number + " is " + (isValid(number) ? "a valid credit card number." : "not a valid credit card number."));
    }

    //Testing if the card number is valid and returns true.
    public static boolean isValid(long number) {
        boolean valid =
			(getSize(number) >= 13 && getSize(number) <= 16) &&
			(prefixMatched(number, 4) || prefixMatched(number, 5) ||
			prefixMatched(number, 37) || prefixMatched(number, 6)) &&
			((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
		return valid;
    }

    /* Step 2 in the flow chart: 
    Takes output from boolean isValid method
    and continues the operation. */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
		String num = number + "";
		for (int p = getSize(number) - 2; p >= 0; p -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(p) + "") * 2);
		}
		return sum;
    }

    /* Return this number if it is a single digit, otherwise,
    return the sum of the two digits. */ 
    public static int getDigit(int number) {
        if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
    }

    //Return sum of odd-place digits in number 
    public static int sumOfOddPlace(long number) {
        int sum = 0;
		String num = number + "";
		for (int p = getSize(number) - 1; p >= 0; p -= 2) {
			sum += Integer.parseInt(num.charAt(p) + "");
		}
		return sum;
    }

    /* Return true if the number d is
    a prefix number. */
    public static boolean prefixMatched(long number, int z) {
        return getPrefix(number, getSize(z)) == z;
    }

    // Return the number of digits in d.
    public static int getSize(long z) {
        String num = z + "";
		return num.length();
    }

    /* Return the first k number of digits from number. 
    If the number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int i) {
        if (getSize(number) > i)  {
			String num = number + "";
			return  Long.parseLong(num.substring(0, i));
		}
		return number;
    }
}

