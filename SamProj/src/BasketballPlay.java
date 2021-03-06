/*This program simulates a basketball game.
 *In this program there are two classes. 
   1. A Basketball class which consists the team and different methods
   1. Tester class with main method, which will create and call all the game methods.
   
*/

class Basketball
{
   // variables
   String team;
   String name;
   int number;
   
   // initialize the variables
   Basketball(String playerTeam, String playerName, int playerNumber)
     {
       team = playerTeam;
       name = playerName;
       number = playerNumber;
     }

   // method
   void dribbleBasketball()
   {
      System.out.println(team + ", from " + name + " " + "who is number " + number + " " + "dribble the ball. ");
   } 
 // method2
   void shootBasketball()
   {
      System.out.println(team + ", from " + name + " " + "who is number " + number + " " + "shoot the ball. ");
   } 

 } 



   // here is the main class, main method will be executing first at runtime and will create all the Basketball class objects for dummy players and call out the method 
   public class BasketballPlay
   {
     /* starts the game,  
      * main method where create the different player objects and calling different methods 
       */ 
	   
     public static void main(String[] args)
     {
       Basketball Team1player1 = new Basketball("p1", "SG", 24);
     
       Basketball Team1player2 = new Basketball("p2", "SG", 25);
    
       Basketball Team1player3 = new Basketball("p3", "SG", 26);

       Basketball Team1player4 = new Basketball("p4", "SG", 27);
  
       Basketball Team1player5 = new Basketball("p5", "SG", 28);

     // calling different methods
       Team1player1.dribbleBasketball();
       Team1player1.shootBasketball();
       Team1player2.dribbleBasketball();
       Team1player5.shootBasketball();
       Team1player3.dribbleBasketball();
       Team1player3.shootBasketball();
       Team1player4.shootBasketball();
  
    }
 }
