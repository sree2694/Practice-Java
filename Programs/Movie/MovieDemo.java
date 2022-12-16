package Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movie = new ArrayList<Movie>();
		movie.add(new Movie("Taare Zameen Par","Aamir Khan",165,2007));
		movie.add(new Movie("Men in Black","F.Gary Gray",115,2019));
 		movie.add(new Movie("Baahubali Begining","S.S.Rajamouli",160,2015));
 		movie.add(new Movie("Gabbar singh","Harish Shankar",153,2012));
 		movie.add(new Movie("Baahubali Conclusion","S.S.Rajamouli",171,2017));
 		movie.add(new Movie("Robo 2.0","S.Shankar",150,2018));
 		
 		Scanner Scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println("  1. Sort by year\n  2. Sort  by name\n  3. Sort by director name\n  4. Exit\n ");
			System.out.println("enter the Choice");
			choice = Scan.nextInt();
			if (choice == 1) {
				Collections.sort(movie, new SortByYear());
				for (Movie m : movie)
					System.out.println(m);
			} else if (choice == 2) {
				Collections.sort(movie, new SortByName());
				for (Movie m : movie)
					System.out.println(m);

			} else if (choice == 3) {
				Collections.sort(movie, new SortByDirectorName());
				for (Movie m : movie)
					System.out.println(m);

			} else if (choice == 4) {
				System.out.println("Exiting....");
				break;
			}
		}

 		
	/*	System.out.println(movie);
		Collections.sort(movie, new SortByDirectorName());
		Collections.sort(movie, new SortByName());
		Collections.sort(movie, new SortByYear());
		for(Movie m: movie)
		System.out.println(m);
		System.out.println(m.getDirectorname()+"\t\t"+m.getName());*/
	}

}
