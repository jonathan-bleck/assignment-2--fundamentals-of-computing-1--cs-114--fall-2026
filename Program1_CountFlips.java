public class Program1_CountFlips {
  public static void main(String[] args) {
    Coin coin = new Coin();
    int coinFlips = 0;
    int headsFlipped = 0;
    int tailsFlipped = 0;

    System.out.println("Lets flip a coin 100 times to see how many Heads or Tails show up!");

    while (coinFlips < 100) {
      coin.flip();
      coinFlips++;
      if (coin.isHeads()) {
        headsFlipped++;
      } else {
        tailsFlipped++;
      }
    }

    System.out.println("Number of Heads: " + headsFlipped);
    System.out.println("Number of Tails: " + tailsFlipped);
  }
}
