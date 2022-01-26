/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: Jan 26, 2022
 > Assignment: #1
 > Description:
 > This Program will
 */

public class CarmichaelConnorAssignment1 {
  public static void main(String[] args) {

    //declaring constants
    final double pi = 3.14;
    final double radius = 2;
    final double height = 3;

//----------------------------------------------------------------------------------------------------
    // Paragraph #1
    System.out.println("    Hey I'm Connor. I am currently working on my degree for Computer");
    System.out.println("Science. I guess I've been passionate about computers for a while.");
    System.out.println("I built my first desktop in 8th grade, and I have been maintaining it");
    System.out.println("ever since. Programming has interested me for a while, and I've dabbled");
    System.out.println("with some languages before. Despite my interset, I never put in enough");
    System.out.println("time to become proficient.");

    //Paragraph #2
    System.out.println("    When I am not studying, I enjoy hanging out with friends, playing");
    System.out.println("video games, and hiking. Lately I have been trying to learn Linux. I've");
    System.out.println("tried to pick it up before, but this time I think I am finally getting the");
    System.out.println("hang of it. I no longer dread using the terminal, and I actually enjoy");
    System.out.println("interfacing with it now. \n \n"); //end Paragraph and create 2 new lines
//----------------------------------------------------------------------------------------------------

    //begin calculation table
    System.out.println("--------------------------------------------");
    System.out.println("Calculate Volume and Surface Area");
    System.out.println("pi = 3.14    radius = 2    height = 3");
    System.out.println("--------------------------------------------");
    System.out.println("Shape   |    Volume   |   Surface Area");
    System.out.println("--------------------------------------------");

    //Calculations for Sphere
    System.out.print("Sphere |      ");
      //Sphere Volume
    System.out.print(4/3f * pi * radius * radius * radius); System.out.print(" | ");
      //Sphere Surface area
    System.out.print(4 * pi * radius * radius); System.out.print("\n");

    //Calculations for Cylinder
    System.out.print("Cylinder |   ");
      //Cylinder Volume
    System.out.print(pi * radius * radius * height); System.out.print(" | ");
      //Cylinder Surface area
    System.out.print((2 * pi * radius * radius) + (2 * pi * radius * height)); System.out.print("\n");

    //Calculations for Cone
    System.out.print("Cylinder |   ");
      //Cone Volume
    System.out.print(1/3f * pi * radius * radius * height); System.out.print(" | ");
      //Cone Surface area
    System.out.print((2 * pi * radius * radius) + (2 * pi * radius * height));
  }//main method
}//CarmichaelConnorAssignment1 class
