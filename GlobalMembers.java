import java.util.Scanner;
public class GlobalMembers
{
	
	public static void drawLine(int n, char symbol)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void rules()
	{
		system("cls");
		System.out.println("\n\n");
		drawLine(80, '-');
		System.out.println("\t\tRULES OF THE GAME\n");
		drawLine(80, '-');
		System.out.println("\t1. Choose any number between 1 to 10\n");
		System.out.println("\t2. If you win you will get all the total betted amount\n");
		System.out.println("\t3. If you bet on wrong number you will lose your betting amount\n\n");
		drawLine(80, '-');
	}


	public static void main(String[] args)
	{
		Object tangible;
		String[] playerName = tangible.Arrays.initializeWithDefaultStringInstances(4);
		int[] amount = new int[4]; // hold player's balance amount
		int[] bettingAmount = new int[4];
		int[] guess = new int[4];
		int dice; // hold computer generated number
		char choice;
		double sum = 0;
		int i;

		tangible.RandomNumbers.seed(time(0)); // "Seed" the random generator

		drawLine(60, '_');
		System.out.println("\n\n\n\t\tCASINO GAME\n\n\n\n");
		drawLine(60, '_');

		for (i = 0; i < 4; i++)

		{
		System.out.print("\n\nEnter Your Name : ");
		playerName[i] = ConsoleInput.readToWhiteSpace(true);

		System.out.print("\nEnter Deposit amount to play game : $");
		amount[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		do
		{
			system("cls");
			rules();

			for (i = 0; i < 4;i++)
			{
			System.out.print("\n\n");
			System.out.print(playerName[i]);
			System.out.print(" Your current balance is $ ");
			System.out.print(amount[i]);
			System.out.print("\n");

			// Get player's betting amount
			do
			{
				System.out.print(playerName[i]);
				System.out.print(", enter money to bet : $");
				bettingAmount[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (bettingAmount > amount)
				{
					System.out.print("Your betting amount is more than your current balance\n");
					System.out.print("\nRe-enter data\n ");
				}
			}while (bettingAmount > amount);


		   for (i = 0;i < 4; i++)
		   {
			   sum += bettingAmount[i];
		   }

			// Get player's numbers
			do
			{
				System.out.print("Guess your number to bet between 1 to 10 :");
				guess[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (guess[i] <= 0 || guess[i] > 10)
				{
					System.out.print("Please check the number!! should be between 1 to 10\n");
					System.out.print("\nRe-enter data\n ");
				}
			}while (guess[i] <= 0 || guess[i] > 10);

			dice = tangible.RandomNumbers.nextNumber() % 10 + 1; // Will hold the randomly generated integer between 1 and 10
			}

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		for (i = 0;i < 4;i++)
		{
				if (dice == guess[i])
				{
				System.out.print("\n\nGood Luck!! ");
				System.out.print(playerName[i]);
				System.out.print("You won Rs.");
				System.out.print(sum);
				System.out.print("\n");
				amount[i] = (int) ((int)amount[i] + sum);
				}
			else
			{
				System.out.print("Bad Luck ");
				System.out.print(playerName[i]);
				System.out.print(" You lost $ ");
				System.out.print(bettingAmount[i]);
				System.out.print("\n");
				amount[i] = amount[i] - bettingAmount[i];
			}
		}
			System.out.print("\nThe winning number was : ");
			System.out.print(dice);
			System.out.print("\n");



			System.out.print("\n");
			System.out.print(playerName[i]);
			System.out.print(", You have $ ");
			System.out.print(amount[i]);
			System.out.print("\n");
			if (amount == 0)
			{
				System.out.print("You have no money to play ");
				break;
			}
			System.out.print("\n\n-->Do you want to play again (y/n)? ");
			choice = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}while (choice == 'Y' || choice == 'y');

		System.out.print("\n\n\n");
		drawLine(70, '=');
		System.out.print("\n\nThanks for playing game. Your balance amount is $ ");
    }

	private static Object time(int i) {
		return null;
	}

	private static void system(String string) {
	}
}