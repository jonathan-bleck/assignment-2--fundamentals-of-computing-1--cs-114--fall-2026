import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    int bottlesTakenDown = 0;

    System.out.println("How much do you wish to drink today?");
    Scanner amountOfBeer = new Scanner(System.in);
    int amountOfBeerChoosen = amountOfBeer.nextInt();
    amountOfBeer.close();

    if (amountOfBeerChoosen > 100) {
      System.out.println("We don't have that many bottles of beer for you!");

    } else { if (amountOfBeerChoosen < 0) {
        System.out.println("Please choose a real number of bottles of beer, we can't serve negative amounts.");

      }
    } 
    
    if (amountOfBeerChoosen > 0 && amountOfBeerChoosen <= 100) {
      
      while (bottlesTakenDown < amountOfBeerChoosen) {
        System.out.println( 100 - bottlesTakenDown + " bottles of beer on the wall");
        System.out.println( 100 - bottlesTakenDown + " bottles of beer");
        System.out.println("Take one down and pass it around");
        bottlesTakenDown++;
        System.out.println( 100 - bottlesTakenDown + " bottles of beer on the wall");

      }

       System.out.println("You have drank enough beer for today. You had " + bottlesTakenDown + " bottles.");

    } else {
      System.out.println("Try again later buddy");
    }

  }
}
