// imports
import java.util.*;

public class FracCalc {

  public static void main(String[] args){
    System.out.println("Fraction calculator: +, -, x, /");

    // TODO: Read the input from the user and call produceAnswer with an equation
    Scanner s = new Scanner(System.in);
    // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
    String choice = s.nextLine();
    System.out.println(produceAnswer(choice));
    // System.out.println("Numerator:" + getNum(choice));
    // Checkpoint 2: Accept user input multiple times.
  }//end main method

  /**
   * produceAnswer - This function takes a String 'input' and produces the result.
   * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
   *      Example: input ==> "1/2 + 3/4"
   * @return the result of the fraction after it has been calculated.
   *      Example: return ==> "1_1/4"
  */

 public static String produceAnswer(String input){

      int space = input.indexOf(" ");
      String Frac1 = input.substring(0,space);
      String sign = input.substring(space + 1, space + 2);
      String Frac2 = input.substring(space + 3);

      int num1 = getNum(Frac1);
      int num2 = getNum(Frac2);

      int den1 = getDen(Frac1);
      int den2 = getDen(Frac2);
      return Frac2;

     // TODO: Implement this function to produce the solution to the input
     // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
      // Checkpoint 2: Return the second operand as a string representing each part.
      //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
      // Checkpoint 3: Evaluate the formula and return the result as a fraction.
      //               Example "4/5 * 1_2/4" returns "6/5".
      //               Note: Answer does not need to be reduced, but it must be correct.
      // Final project: All answers must be reduced.
      //               Example "4/5 * 1_2/4" returns "1_1/5".



  }//end produceAnswer method

  public static int getNum(String Frac){
      int slash = Frac.indexOf("/");
      int Unders = Frac.indexOf("_");
    // a mixed number
    if (Frac.indexOf("_")!= -1){
      return Integer.parseInt(Frac.substring(Unders+1,slash));
    }

    // a regular frac (a/b)
    else if (slash != -1){
      return Integer.parseInt(Frac.substring(0,slash));
    }

    // not a mixed number (a)
    else {
        return Integer.parseInt(Frac);
      }

  }

 public static int getDen(String Frac);
   if (slash)
  // TODO: Fill in the space below with helper methods

  /**
   * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
   *      Use this helper method in the Final Checkpoint to reduce fractions.
   * @param a - First integer.
   * @param b - Second integer.
   * @return The GCD.
   */
  public static int greatestCommonDivisor(int a, int b){
    return 0;
  }//end greatestCommonDivisor method

  /**
   * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
   *      Use this helper method in Checkpoint 3 to evaluate expressions.
   * @param a - First integer.
   * @param b - Second integer.
   * @return The LCM.
   */
  public static int leastCommonMultiple(int a, int b){
    return 0;
  }//end leastCommonMultiple

}//end class