/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: Feb 2, 2022
 > Assignment: #2
 > Description:
 > This program will ask for student name and their grades, and
 > it will calcuate their final grade and print out a table with
 > a grading scale and weight catagories.
 */
import java.util.Scanner;

public class CarmichaelConnorAssignment2 {
  public static void main(String[] args) {
//Creating a new Scanner object
    Scanner input = new Scanner(System.in);

//Weight constants for corresponding grades (Learning Activites, Homework [HW], Quizzes, Midterms, and Final Exam)
//and a var for letter grade
    final double WEIGHTACTIVITIES = 0.1;
    final double WEIGHTHW = 0.4;
    final double WEIGHTQUIZ = 0.1;
    final double WEIGHTMIDTERM = 0.2;
    final double WEIGHTFINALEXAM = 0.2;
    String letterGrade = "A";

//------------------------------------------------------------------------------
//Prompt User to input student data
    //Print Title
    System.out.println(" |----------------------------------------------------------------------|");
    System.out.printf("%2s%44s%27s %n","|","Grade Calculator","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");

    //Prompt for input
      //Student Name
    System.out.printf("%26s","Enter Student's Name: ");
      String name = input.nextLine();

      //Grade prompts and Decarling Grade Catagory Variables
    System.out.printf("%37s","Enter Learning Activities Grade: ");
      double gradeActivities = input.nextDouble();

    System.out.printf("%26s","Enter Homework Grade: ");
      double gradeHW = input.nextDouble();

    System.out.printf("%22s","Enter Quiz Grade: ");
      double gradeQuiz = input.nextDouble();

    System.out.printf("%26s","Enter Mid-Term Grade: ");
      double gradeMidterm = input.nextDouble();

    System.out.printf("%28s","Enter Final Exam Grade: ");
      double gradeFinalExam = input.nextDouble();
      System.out.printf("%n%n"," ");

//-------------------------------------------------------------------------------
//Compute Final Grade and Set the letter grade
    double finalGrade = (gradeActivities*WEIGHTACTIVITIES)+(gradeHW*WEIGHTHW)+(gradeQuiz*WEIGHTQUIZ)+(gradeMidterm*WEIGHTMIDTERM)+(gradeFinalExam*WEIGHTFINALEXAM);
    //if else tower to see which letter their grade corresponds to
    
    if (finalGrade >= 94){
      letterGrade = "A";
    }else if (finalGrade >= 90){
      letterGrade = "A-";
    }else if (finalGrade >= 87){
      letterGrade = "B+";
    }else if (finalGrade >= 83){
      letterGrade = "B";
    }else if (finalGrade >= 80){
      letterGrade = "B-";
    }else if (finalGrade >= 77){
      letterGrade = "C+";
    }else if (finalGrade >= 73){
      letterGrade = "C";
    }else if (finalGrade >= 70){
      letterGrade = "C-";
    }else if (finalGrade >= 67){
      letterGrade = "D+";
    }else if (finalGrade >= 63){
      letterGrade = "D";
    }else if (finalGrade >= 60){
      letterGrade = "D-";
    }else{
      letterGrade = "F";
    }

//print out final grade and name
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%36s%s%n","Student: ",name);
    System.out.printf("%40s%2.2f%s%3s%n","Final Grade: ",finalGrade,"%",letterGrade);
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%s%n"," |//////////////////////////////////////////////////////////////////////|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
//------------------------------------------------------------------------------
//Print out Grading Scale and Weighted Catagories
  //Titles
    System.out.printf("%-4s%-18s%-10s%4s%12s%20s%4s %n"," |"," Letter Grade","Percentage ","|","Catagory ","Weight","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    //The Grading Scale and Grading Weights data
    System.out.printf("%-4s%-18s%-10s%5s%23s%6s%7s %n"," |"," A ","94+    ","|","Learning Activites: ","10%","|");
    System.out.printf("%-4s%-18s%-10s%5s%13s%16s%7s %n"," |"," A-","93-90 ","|","Homwork:  ",          "40%","|");
    System.out.printf("%-4s%-18s%-10s%5s%13s%16s%7s %n"," |"," B+","89-87 ","|","Quizzes:  ",          "10%","|");
    System.out.printf("%-4s%-18s%-10s%5s%14s%15s%7s %n"," |"," B ","86-83 ","|","Mid-term:  ",         "20%","|");
    System.out.printf("%-4s%-18s%-10s%5s%16s%13s%7s %n"," |"," B-","82-80 ","|","Final Exam:  ",       "20%","|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," C+","79-77 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," C ","76-73 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," C-","72-70 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," D+","69-67 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," D ","66-63 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," D-","62-60 ","|",                             "|");
    System.out.printf("%-4s%-18s%-10s%5s%36s %n",       " |"," F ","59-0  ","|",                             "|");
    System.out.printf("%2s%35s%36s %n","|","|","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");

  }//main method
}//class
