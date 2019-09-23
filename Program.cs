using System;


namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("d");

            string appName = "Number Guesser";
            string appVersion = "1.0.0";
            string appAuthor = "ba";

            //change text color
            Console.ForegroundColor = ConsoleColor.DarkGreen;
            Console.WriteLine("{0}: Version {1} by {2}", appName, appVersion, appAuthor);
            //reset text color
            Console.ResetColor();

            //Ask users name
            Console.WriteLine("What is your name?");

            //get user input
            string inputName = Console.ReadLine();

            while (true)
            {
                Console.WriteLine("Hello {0}, let's play a game", inputName);

                Random rand = new Random();
                int correctNumber = rand.Next(1, 10);

                int guess = 0;

                Console.WriteLine("Guess a number between 1 and 10");
                while (guess != correctNumber)
                {
                    //get user input
                    string input = Console.ReadLine();

                    //exception for string userinput
                    if (!int.TryParse(input, out guess))
                    {
                        Console.ForegroundColor = ConsoleColor.Blue;
                        Console.WriteLine("not a num");
                        //reset text color
                        Console.ResetColor();
                        continue;
                    }

                    //cast to int to put in guess
                    guess = Int32.Parse(input);

                    //match guess to correctnum
                    if (guess != correctNumber)
                    {
                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("wrong num");

                        Console.ResetColor();
                    }
                }
                Console.ForegroundColor = ConsoleColor.Yellow;
                Console.WriteLine("correct");

                Console.ResetColor();

                //ask to play again
                Console.WriteLine("play again? [y or n]");

                string answer = Console.ReadLine().ToLower();

                if (answer == "y")
                {
                    continue;
                }
                else if(answer == "n")
                {
                    return;
                }
                else
                {
                    return;
                }
            }
        }
    }
}
