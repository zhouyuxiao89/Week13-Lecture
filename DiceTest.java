import java.util.Scanner;
public class DiceTest {
    public static void main(String[] args)
      {
          	
            Scanner input = new Scanner(System.in);
            System.out.println("How many dices do want to roll?\n");
            int numberOfDice = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int maxValue = input.nextInt();
            int diceNumber= Dice.RollDice(numberOfDice, maxValue);
            Dice dice1 = new Dice();
            System.out.printf("The dice number is %d:\n",diceNumber);
            System.out.printf("The times the dice rolled is %d\n",dice1.getCount());
                                
            //-------------------------------------------
            System.out.println("How many dices do want to roll?\n");
            int number = input.nextInt();
            System.out.println("What is the max value of each dice?\n");
            int max = input.nextInt();
            int dice_Number= Dice.RollDice(number, max);
            Dice dice2 = new Dice();
            System.out.printf("The dice number is %d:\n",dice_Number);
            System.out.printf("The times the dice rolled is %d:",dice2.getCount());
      }
}
