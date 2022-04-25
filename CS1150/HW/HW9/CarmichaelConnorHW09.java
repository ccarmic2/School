public class CarmichaelConnorHW09{
  public static void main(String[] args) {
    final int    MAX_MILES     = 500;
    final int    NUM_OF_CARS   = 6;
    final double TIME_INTERVAL = 0.25;

 //create race cars
    RaceCar[] raceCars = new RaceCar[NUM_OF_CARS];
    creatRaceCars(raceCars);

 //print race cars at beginning of the race
    System.out.println(" Race cars at start of race");
    printRaceCars(raceCars);

 //begin race
    startRace(raceCars, TIME_INTERVAL, MAX_MILES);
    int winner = findWinner(raceCars, MAX_MILES);
    System.out.println();

 //print race cars at end of race
    System.out.println(" Race cars at end of race");
    printRaceCars(raceCars);

 //print winner
    System.out.println(" The winner is: " + raceCars[winner].getDriver() + " with " +
                        raceCars[winner].getOdometer() + " miles");
  }

  public static void printRaceCars (RaceCar[] raceCars){
    System.out.printf("-------------------------------------------------\n");
    System.out.printf("%9s%10s%14s%11s%n", "Race Car", "Driver", "Average", "Miles");
    System.out.printf("%31s%17s%n", "Speed", "Completed");
    System.out.println();
    System.out.printf("-------------------------------------------------\n");

    for (int i = 0; i < raceCars.length; i++){
      System.out.printf("%s%-12d%-13s%-13.2f%.2f%n", " ", raceCars[i].getNumber(),
      raceCars[i].getDriver(), raceCars[i].getAverageSpeed(), raceCars[i].getOdometer());
    }

    System.out.println();
  }

  public static void creatRaceCars(RaceCar[] raceCars){
    raceCars[0] = new RaceCar("Shrek", 63, 75);
    raceCars[1] = new RaceCar("Fiona", 42, 85);
    raceCars[2] = new RaceCar("Donkey", 19, 81);
    raceCars[3] = new RaceCar("Dragon", 24, 118);
    raceCars[4] = new RaceCar("Farquaad", 44, 109);
    raceCars[5] = new RaceCar("Pinocchio", 8, 87);
  }

  public static void startRace (RaceCar[] raceCars, double timeInterval, int maxMiles){
    double  time    = 0;
    int     numTime = 0;
    boolean endRace = false;

    while (endRace == false){
      time += timeInterval;
      numTime++;
      System.out.println(" Racing time = "+ time);
      if(numTime >= 4){
        for(int i = 0; i < raceCars.length; i++){
          raceCars[i].updateOdometer();
        }
        for (int i = 0; i < raceCars.length; i++){
          if(raceCars[i].getOdometer() >= maxMiles){
            endRace = true;
          }
          numTime = 0;
        }
      }
    }
  }

  public static int findWinner (RaceCar[] raceCars, double maxMiles){
    int winnerIndex = 0;

    for ( int i = 0; i < raceCars.length; i++){
      if (raceCars[i].getOdometer() >= maxMiles &&
          raceCars[i].getAverageSpeed() > raceCars[winnerIndex].getAverageSpeed()){
        winnerIndex = i;
      }
    }
    return winnerIndex;
  }

  public static void writeRaceCarDetailsToFile(RaceCar[] raceCars){

  }

}

class RaceCar {
  private String driver;
  private int number;
  private double averageSpeed;
  private Odometer odometer;

  public RaceCar(String driver, int number, int averageSpeed){
    this.driver = driver;
    this.number = number;
    this.averageSpeed = averageSpeed;
    odometer = new Odometer();
  }

  public String getDriver (){
    return driver;
  }

  public int getNumber (){
    return number;
  }

  public double getAverageSpeed(){
    return averageSpeed;
  }

  public double getOdometer(){
    return odometer.getMiles();
  }

  public void updateOdometer(){
    odometer.incrementMiles(averageSpeed);
  }
}

class Odometer {
  private double miles;

  public Odometer (){
    miles = 0;
  }

  public double getMiles(){
    return miles;
  }

  public void incrementMiles(double milesTraveled){
    miles += milesTraveled;
  }
}
