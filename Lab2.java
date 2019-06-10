public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
   Robot.load("square.txt");
        Robot.setDelay(0.1);

        row();
        row();
        row();
        row();
    }

    public static void clean()
    { //pre: robot is facing dark square post: robot is on clean square
        Robot.move();
        Robot.makeLight();}

    public static void row()
    { //pre: robot is facing row of 5 dark squares post: robot is in front of 5 clean squares facing left
        clean();
        clean();
        clean();
        clean();
        clean();
        Robot.move();
        Robot.turnLeft(); }
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
            Robot.load("comb.txt");
        Robot.setDelay(0.05);
        
        partofComb();
        partofComb();
        partofComb();
        partofComb();
        upNback();
    }
    public static void partofComb()
    //pre: robot is facing north post: robot is facing north
    {upNback();
        turnRight();
        Robot.move();
        darken();}
    public static void upNback()
    //pre: robot is facing north post: robot is facing east 
    {turnRight();
        forward();
        Robot.makeDark();
        Robot.turnLeft();
        Robot.turnLeft();
        backward();}
    public static void turnRight()
    //post: robot has turned right
    { Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft(); }
    public static void darken()
    { //pre: standing on clean square post: standing in front of darkened square
        Robot.makeDark();
        Robot.move();}

    public static void forward()
    { //pre: standing on clean square behind 7 clean squares post: standing in front of 7 darkened squares
        darken();
        darken();
        darken();
        darken();
        darken();
        darken(); }
   public static void backward()
   { //pre: facing 7 darkened squares post: in front of 7 darkened squares
       Robot.move();
       Robot.move();
       Robot.move();
       Robot.move();
       Robot.move();
       Robot.move(); }
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    partofcheckerboard();
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
        partofcheckerboard();
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
        partofcheckerboard();
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
        partofcheckerboard();
    }
    public static void pattern1()
    { //pre: row of 7 squares, all are clean post: row is checkered, facing north
        Robot.move();
        darken();
        Robot.move();
        darken();
        Robot.move();
        darken();
        Robot.move(); 
        Robot.makeDark();
    }
     public static void partofcheckerboard()
     { //pre: facing north post: still facing north
         pattern1();
         turnRight();
         Robot.move();
         turnRight();
         pattern1(); } 
  }
}
