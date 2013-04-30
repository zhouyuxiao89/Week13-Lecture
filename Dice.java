import java.util.Scanner;
public class Dice {

public int RollDice(int DiceNumber)
{
  int computerNum;
  computerNum = 1 + (int)(Math.random()*6*DiceNumber);
  return computerNum;
}
public static int Roll_1_Dice()
{
  int computerNum;
  computerNum = 1 + (int)(Math.random()*6);
  return computerNum;
}
}
