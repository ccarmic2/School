import java.util.Scanner;

public class CarmichaelConnorHW06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//declare and initialize constants
    int NUMBER_OF_GRADES = 10;

//declare and Initalize variables
    int highestGrade    = 0;
    double gradeAvg     = 0;

//delcare and Initalize arrays
    int grades[] = new int[NUMBER_OF_GRADES];
    char letterGrades[] = new char[NUMBER_OF_GRADES];

//prompt for Student grades
    System.out.println("   Enter 10 Student Grades (must be between 0-100)");
    enterExamGrades(grades, input);
    System.out.println();
    System.out.println();
//get and print highestGrade
    highestGrade = findHighestGrade(grades);
    System.out.println("   Highest Grade: "+highestGrade);
//get and print average
    gradeAvg = computeAverage(grades);
    System.out.println("   Average Grade is: "+gradeAvg);

    computeLetterGrades(grades, letterGrades, highestGrade);

    displayGrades(grades, letterGrades);



  }

  public static void enterExamGrades (int[] grades, Scanner input){
    int currentGrade = 0;
    for (int i = 0; i < grades.length; i++){
      currentGrade = i+1;

      do{
      System.out.print("   Enter Grade "+ currentGrade +": ");
      grades[i] = input.nextInt();

      }while (grades[i] < 0 || grades[i] > 100);
    }
  }

  public static int findHighestGrade (int[] grades){
    int highestGrade = 0;
    for (int i = 0; i < grades.length; i++){
      if (grades[i] > highestGrade){
        highestGrade = grades[i];
      }
    }
    return highestGrade;
  }

  public static double computeAverage (int[] grades){
    int sum = 0;
    for (int i =0; i < grades.length; i++){
      sum += grades[i];
    }

    double average = (double)sum/(double)grades.length;
    return average;
  }

  public static void computeLetterGrades (int[] grades, char[] letterGrades, int highestGrade){
    for (int i = 0; i<letterGrades.length; i++){
      if (grades[i] >= (highestGrade - 10)){
        letterGrades[i] = 'A';
      }else if (grades[i] >= (highestGrade - 20)){
        letterGrades[i] = 'B';
      }else if (grades[i] >= (highestGrade - 30)){
        letterGrades[i] = 'C';
      }else if (grades[i] >= (highestGrade - 40)){
        letterGrades[i] = 'D';
      }else{
        letterGrades[i] = 'F';
      }
    }
  }

  public static void displayGrades (int[] grades, char[] letterGrades){
    int currentStudent = 0;
    System.out.printf("\t Students \t\t Exam Grade \t\t Letter Grade\n");
    System.out.printf("\t ------------------------------------------------------------\n");

    for (int i = 0; i < grades.length; i++){
      currentStudent++;
      System.out.printf("%10d%25d%23c%n",currentStudent, grades[i], letterGrades[i]);
    }

  }

  public static void displayNumberOfLetterGrades (char[] letterGrades){

  }

}
