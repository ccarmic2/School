import java.util.Scanner;

public class CarmichaelConnorHW04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final String STOP_SENTINAL = "stop";
    int lastWordLength;
    int indexSmallestWord = 0;
    int indexLargestWord = 0;
    int numOfWords = 0;
    int numOfChars = 0;
    int numOfVowels = 0;
    int numOfConst = 0;
    String usrWords = "";
    String smallestWord = "";
    String largestWord = "";

    System.out.printf("%s%n","Enter Words and end with STOP");

    while (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
      System.out.printf("%n");
      usrWords = input.next();

      if (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
        int wordLengthIndex= usrWords.length() - 1;
        int wordLength = usrWords.length();
        char firstLetter = usrWords.charAt(0);
        char lastLetter = usrWords.charAt(wordLengthIndex);
        String usrsWordsNoCaps = usrWords.toLowerCase();

        numOfChars = numOfChars+wordLength;
        numOfWords = numOfWords+1;

        for (int k = 0; k <= wordLengthIndex; k++){
          char charAtWordIndex = usrsWordsNoCaps.charAt(k);
          if (charAtWordIndex == 'a' || charAtWordIndex == 'i' || charAtWordIndex == 'o' || charAtWordIndex == 'u' || charAtWordIndex == 'e'){
            numOfVowels = numOfVowels+1;
          }else if ((charAtWordIndex>='b' && charAtWordIndex <= 'd') || (charAtWordIndex >= 'f' && charAtWordIndex <= 'h') ||
          (charAtWordIndex>='j' && charAtWordIndex<='n') || (charAtWordIndex>='p' && charAtWordIndex<='t') || (charAtWordIndex>='v' && charAtWordIndex<='z')){
            numOfConst = numOfConst+1;


          }
        }

        if (wordLength<=indexSmallestWord){
          smallestWord = usrWords;
        }
        if (wordLength>=indexLargestWord){
          largestWord = usrWords;
        }


        System.out.printf("\t Word: %s\n\t First Character: %s\n\t Last Character: %s\n\t Word Length: %s\n\t", usrWords, firstLetter, lastLetter, wordLength);
      }
    }

    input.close();

    System.out.printf("\t Number of Words: %d\n\t Number of Characters: %d\n\t Number of Vowels: %d\n\t Number of Constants %d\n\t Smallest Word: %s\n\t Largest Word: %s\n ",numOfWords,numOfChars,numOfVowels,numOfConst,smallestWord,largestWord);
  }
}
