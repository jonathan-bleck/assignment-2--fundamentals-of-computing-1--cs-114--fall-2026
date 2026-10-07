import java.util.Scanner;
// import java.util.ArrayList;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {

    // A test that did not work for me, might be possible?
    // ArrayList<Character> vowels = new ArrayList<>();
    // vowels.add('a');
    // vowels.add('e');
    // vowels.add('i');
    // vowels.add('o');
    // vowels.add('u');

    int vowelCountA = 0;
    int vowelCountE = 0;
    int vowelCountI = 0;
    int vowelCountO = 0;
    int vowelCountU = 0;

    int nonVowelCount = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please input any string of letters! - ");
    String input = scanner.nextLine();
    scanner.close();
    System.out.println();

    input = input.toLowerCase();
    for (int inputCharacter = 0; inputCharacter < input.length(); inputCharacter++) {
      char characters = input.charAt(inputCharacter);
      switch (characters) {
        case 'a':
          vowelCountA++;
          break;
        case 'e':
          vowelCountE++;
          break;
        case 'i':
          vowelCountI++;
          break;
        case 'o':
          vowelCountO++;
          break;
        case 'u':
          vowelCountU++;
          break;
        default:
          nonVowelCount++;
      }
    }
    
    System.out.println("The string you inputed contained " + vowelCountA + " A's, " + vowelCountE + " E's, " + vowelCountI + " I's, " + vowelCountO + " O's, " + vowelCountU + " U's, And it had a total of " + nonVowelCount + " non-vowels.");


  }
}
