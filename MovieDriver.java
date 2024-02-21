import java.util.Scanner;

public class MovieDriver 
{

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		Movie movie = new Movie();
		
		// TASK 1 STARTS HERE
		System.out.println("Enter the name of a movie");
		movie.setTitle(inp.nextLine());
		System.out.println("Enter the rating of the movie");
		movie.setRating(inp.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		movie.setSoldTickets(inp.nextInt());
		System.out.println(movie);
		
		inp.nextLine();
		// TASK 1 ENDS HERE!!!
		
		// TASK 2 STARTS HERE
		char goOn = 'y';
		while (goOn == 'y')
		{
			System.out.println("Enter the name of a movie");
			movie.setTitle(inp.nextLine());
			System.out.println("Enter the rating of the movie");
			movie.setRating(inp.nextLine());
			System.out.println("Enter the number of tickets sold for this movie");
			movie.setSoldTickets(inp.nextInt());
			System.out.println(movie);
			
			System.out.println("Do you want to enter another? (y or n)");
			goOn = inp.next().charAt(0);
			
			inp.nextLine();
		}
		// TASK 2 ENDS HERE!!!
		
		System.out.println("Goodbye");
		
		inp.close();
	}

}
