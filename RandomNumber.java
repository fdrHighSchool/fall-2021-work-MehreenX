import java.util.Scanner; //importing scanner class
class Main {
  public static void main(String[] args) {
      Scanner Num = new Scanner(System.in);
    //variables for the range
    int min = 1;
    int max = 100;


    //Generate random int value from 1 to 6
      System.out.println("Pick a random number from "+min+" to "+max+ ":");
      //user input
      int userAns = Num.nextInt();

      //set answer
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

      //program output
      if(userAns == random_int){
        System.out.println("Yay, you did it T^T");
          }
      //when user guesses lower than the chosen number
      else if (userAns < random_int){
        System.out.println("WRONGG, picked too low...pick again");


      }
      //when user guesses higher than the chosen number
      else if(userAns > random_int){
        System.out.println("WRONGGG, picked too high...");

      }

     if (userAns != random_int) {
            System.out.println( "Dumb Dum");

            System.out.println(
                "The number was " + random_int +
                " ,go away you can't play ahaha");
     }
    }

} 
