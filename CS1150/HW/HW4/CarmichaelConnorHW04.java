/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: Feb 25, 2022
 > Assignment: #4
 > Description:
 > This program will take an undefined ammount of words and process each word listing
 > stats for each word like: the length of the word, first letter, and last letter.
 > After typting "stop" the program will stop processing any other words and list
 > overall stats about the list of words entered (besides "stop") like: # of vowels,
 > # of consonants, # of words, # of characters, smallest word, and largest word.
 */

import java.util.Scanner;

public class CarmichaelConnorHW04 {
  public static void main(String[] args) {
//create a new scanner obj
    Scanner input = new Scanner(System.in);

//declare and initialize variables/constants
    final String STOP_SENTINAL = "stop";
    int lengthSmallestWord     = 0;
    int lengthLargestWord      = 0;
    int numOfWords             = 0;
    int numOfChars             = 0;
    int numOfVowels            = 0;
    int numOfConst             = 0;
    String usrWords            = "";
    String smallestWord        = "";
    String largestWord         = "";
    boolean printFinalData     = true;

    System.out.printf("%27s%n", "Word Data");
    System.out.printf("|-------------------------------------------|%n");

//prompt user for list of words
    System.out.printf("\t%s%n","Input words and end with \"stop\"");
    System.out.printf("|- - - - - - - - - - - - - - - - - - - - - -|%n");

//loop through each word user enters while omiting "stop" and using "stop" as a sentinal value
    while (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
      usrWords = input.next();

  //make sure the word is not "stop"
      if (usrWords.equalsIgnoreCase(STOP_SENTINAL) == false){
    //variables for last letter index/last letter, first letter, word in lower case, and word length
        int wordLengthIndex    = usrWords.length() - 1;
        int wordLength         = usrWords.length();
        char firstLetter       = usrWords.charAt(0);
        char lastLetter        = usrWords.charAt(wordLengthIndex);
        String usrsWordsNoCaps = usrWords.toLowerCase();

    //set number of chars and words
        numOfChars = numOfChars+wordLength;
        numOfWords = numOfWords+1;

    //for loop to count number of vowels and consonant
        for (int k = 0; k <= wordLengthIndex; k++){
          char charAtWordIndex = usrsWordsNoCaps.charAt(k);
      //check if vowel
          if (charAtWordIndex == 'a' || charAtWordIndex == 'i' || charAtWordIndex == 'o' || charAtWordIndex == 'u' || charAtWordIndex == 'e'){
            numOfVowels = numOfVowels+1;
      //check if consonant
          }else if (charAtWordIndex>='b' && charAtWordIndex<='z'){
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
        System.out.printf("\t Word:            %s\n\t First Character: %s\n\t Last Character: %2s\n\t Word Length: %5s\n", usrWords, firstLetter, lastLetter, wordLength);
        System.out.printf("|-------------------------------------------|%n");

      }else if (usrWords.equalsIgnoreCase(STOP_SENTINAL) == true && numOfWords == 0){
        System.out.printf("\t !!!You only entered \"stop\"!!!");
        printFinalData = false;
      }
    }

    input.close();

  //final print out for the stats of all the words entered
    if (printFinalData == true){
      System.out.printf("|///////////////////////////////////////////|%n");
      System.out.printf("|-------------------------------------------|%n");
      System.out.printf("\t Number of Words: %6d\n\t Number of Characters: %d\n\t Number of Vowels: %5d\n\t Number of Constants %3d\n\t Smallest Word:        %s\n\t Largest Word:         %s\n",numOfWords,numOfChars,numOfVowels,numOfConst,smallestWord,largestWord);
      System.out.printf("|-------------------------------------------|%n");
      System.out.printf("|///////////////////////////////////////////|%n");
      System.out.printf("|-------------------------------------------|%n");
    }
  }//main
}//class
