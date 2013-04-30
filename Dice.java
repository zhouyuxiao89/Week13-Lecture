import java.util.Scanner;
public class Dice {
  static int RollCount = 0;
  public static int RollDice(int DiceNumber,int Max)
  {
      int dice;
      dice = 1 + (int)(Math.random()*Max*DiceNumber);
      RollCount ++;
      return dice;	
  }
  public int getCount()
  {
      return RollCount;
  }
  public static int Roll_1_Dice()
  {
      int computerNum;
      computerNum = 1 + (int)(Math.random()*6);
      return computerNum;
  }
}


