public class DiceTest {
  public static void main(String[] args)
  {
  int numberOfDice = 3;
  Dice dice = new Dice();
  System.out.printf("For 3 Dices, dice number is %d after roll the dices\n\n ",dice.RollDice(numberOfDice) );
  System.out.printf("For one Dices, dice number is %d after roll the dices\n\n ",Dice.Roll_1_Dice() );
  }
}
