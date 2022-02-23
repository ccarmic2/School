import java.util.Scanner;

public class CarmichaelConnorHW04 {
  public static void main(String[] args) {
//create a new scanner obj
    Scanner input = new Scanner(System.in);

//declare and initialize variables/constants
    final String STOP_SENTINAL = "stop";
    int lengthSmallestWord = 0;
    int lengthLargestWord = 0;
    int numOfWords = 0;
    int numOfChars = 0;
    int numOfVowels = 0;
    int numOfConst = 0;
    String usrWords = "";
    String smallestWord = "";
    String largestWord = "";

//prompt user for list of words
    System.out.printf("%s%n","Enter Words and end with STOP");

//loop through each word user enters while omiting "stop" and using "stop" as a sentinal value
    while (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
      System.out.printf("%n");
      usrWords = input.next();

  //make sure the word is not "stop"
      if (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
    //variables for last letter index/last letter, first letter, word in lower case, and word length
        int wordLengthIndex= usrWords.length() - 1;
        int wordLength = usrWords.length();
        char firstLetter = usrWords.charAt(0);
        char lastLetter = usrWords.charAt(wordLengthIndex);
        String usrsWordsNoCaps = usrWords.toLowerCase();

    //set number of chars and words
        numOfChars = numOfChars+wordLength;
        numOfWords = numOfWords+1;

    //for loop to count number of vowels and constants
        for (int k = 0; k <= wordLengthIndex; k++){
          char charAtWordIndex = usrsWordsNoCaps.charAt(k);
      //check if vowel
          if (charAtWordIndex == 'a' || charAtWordIndex == 'i' || charAtWordIndex == 'o' || charAtWordIndex == 'u' || charAtWordIndex == 'e'){
            numOfVowels = numOfVowels+1;
      //check if constant
          }else if ((charAtWordIndex>='b' && charAtWordIndex <= 'd') || (charAtWordIndex >= 'f' && charAtWordIndex <= 'h') ||
          (charAtWordIndex>='j' && charAtWordIndex<='n') || (charAtWordIndex>='p' && charAtWordIndex<='t') || (charAtWordIndex>='v' && charAtWordIndex<='z')){
            numOfConst = numOfConst+1;
          }
        }


    //set smallest word
        if (wordLength<=lengthSmallestWord || numOfWords<=1){
          lengthSmallestWord = wordLength;
          smallestWord = usrWords;
        }
    //set largest word
        if (wordLength>=lengthLargestWord || numOfWords<=1){
          lengthLargestWord = wordLength;
          largestWord = usrWords;
        }


    //print out info for each word processed
        System.out.printf("\t Word: %s\n\t First Character: %s\n\t Last Character: %s\n\t Word Length: %s\n\t", usrWords, firstLetter, lastLetter, wordLength);
      }
    }

    input.close();

  //final print out for the stats of all the words entered
    System.out.printf("\t Number of Words: %d\n\t Number of Characters: %d\n\t Number of Vowels: %d\n\t Number of Constants %d\n\t Smallest Word: %s\n\t Largest Word: %s\n ",numOfWords,numOfChars,numOfVowels,numOfConst,smallestWord,largestWord);
  }
}
