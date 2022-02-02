// imports
import java.util.*;

public class FracCalc {

  public static void main(String[] args) {
    System.out.println("Fraction calculator: +, -, x, /");
    System.out.println("Type in your equation:");

    Scanner s = new Scanner(System.in);

    String choice = s.nextLine();
    System.out.println(produceAnswer(choice));

  }// end main method

  public static String produceAnswer(String input) {

    int space = input.indexOf(" ");
    String Frac1 = input.substring(0, space);
    String sign = input.substring(space + 1, space + 2);
    String Frac2 = input.substring(space + 3);

    int num1 = getNum(Frac1);
    int num2 = getNum(Frac2);

    int den1 = getDen(Frac1);
    int den2 = getDen(Frac2);

    int Whole1 = getWhole(Frac1);
    int Whole2 = getWhole(Frac2);

    num1 += Whole1 * den1;
    num2 += Whole2 * den2;

    String ans = doMath(num1, den1, num2, den2, sign);

    return ans;

  }// end produceAnswer method

  public static int getNum(String Frac) {
    int slash = Frac.indexOf("/");
    int Unders = Frac.indexOf("_");
    // a mixed number
    if (Frac.indexOf("_") != -1) {
      return Integer.parseInt(Frac.substring(Unders + 1, slash));
    }

    // a regular frac (a/b)
    else if (slash != -1) {
      return Integer.parseInt(Frac.substring(0, slash));
    }

    // not a mixed number (a)
    else {
      return Integer.parseInt(Frac);
    }

  }

  public static int getDen(String Frac) {
    int slash = Frac.indexOf("/");
    int Unders = Frac.indexOf("_");
    if (slash == -1) { // no slash
      return 1;
    } else {
      return Integer.parseInt(Frac.substring(slash + 1));// there's a slash, take dem

    }
  }

  public static int getWhole(String Frac) {
    int slash = Frac.indexOf("/");
    int Unders = Frac.indexOf("_");
    if (Unders != -1) {
      return Integer.parseInt(Frac.substring(0, Unders));
    } else {
      return 0;
    }
  }

  public static int improperNum(int whole, int num, int den) {
    return (whole * den + num);
  }

  public static String doMath(int num1, int den1, int num2, int den2, String operation) {
    if (operation.equals("+")) {
      int finalNumerator = (num1 * den2) + (num2 * den1);
      int finalDenominator = (den1 * den2);
      return reduce(finalNumerator, finalDenominator);
    }
    else if (operation.equals("-")) {
      int finalNumerator  = (num1 * den2) - (num2 * den1);
      int finalDenominator  = (den1 * den2);
      return reduce(finalNumerator, finalDenominator);
    }
    else if (operation.equals("*")){
      int finalNumerator = num1 * num2;
      int finalDenominator = den1 * den2;
      return reduce(finalNumerator, finalDenominator);
    }
    else {
      int finalNumerator = (num1 * den2);
      int finalDenominator = (num2 * den1);
      return reduce(finalNumerator, finalDenominator);
     }
  }

  public static String reduce(int numerator, int denominator) {
    for(int i=denominator; i>1; i--) {
      if(((numerator % i) == 0) && ((denominator % i) == 0)) {
        numerator = numerator / i;
        denominator = denominator / i;
        i = -1;
      }
    }
    //return numerator + "/" + denominator;
 int wholeNum = numerator / denominator;
 int mixedFrac = numerator % denominator;

if (numerator == 0) {
  return "0";
}
if (wholeNum == 0){
  return mixedFrac + "/" + denominator;
}else if(mixedFrac == 0) {
  return Integer.toString(wholeNum);
}else{
  return wholeNum + "_" + mixedFrac + "/" + denominator;
}

}


  // public static int greatestCommonDivisor(int a, int b){
  // return 0;
  // }//end greatestCommonDivisor method

  // public static int leastCommonMultiple(int a, int b){
  // return 0;
  // }//end leastCommonMultiple

}// end class
