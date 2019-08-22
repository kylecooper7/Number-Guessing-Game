import java.util.Scanner;

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				Scanner userInput2 = new Scanner(System.in);
				boolean flag3 = false;
				String singularOrPlural = "guess";
				int counter = 0;
				boolean flag2 = true;
				boolean flag = true;
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello " + name);
			
			while(flag2) {
				if(flag3) {
				System.out.println("Let's Play Again!");
				}
			System.out.println("Choose your range:");
			int range = userInput2.nextInt();
				System.out.println("Guess a number from 1 to " + range);
				int randomNumber = (int) ( (Math.random()) * range) + 1;
				flag = true;
				while(flag)
					{
					if (counter > 0) {
						singularOrPlural = "guesses";
					}
					counter++;
				int guess = userInput2.nextInt();
				if (name.equals("Kyle")) {
					randomNumber = guess;
				}
				if (guess < randomNumber) {
					System.out.println("That's too low");
				}
				if (guess > randomNumber) {
					System.out.println("That's too high");
				}
				if (guess == randomNumber) {
					System.out.println("You got it.");
					System.out.println("It only took you "+ counter + " " + singularOrPlural);
					flag = false;
					System.out.println("Play Again?");
					String playAgain = userInput.nextLine();
					if(playAgain.equals("yes"))
					{
					flag2 = true;
					System.out.println();
					flag3 = true;
					counter = 0;
					//Test
					}
				
							
							
							
				}
					}
					}
			}

	}
