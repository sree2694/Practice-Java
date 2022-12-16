package Movie;

import java.util.Comparator;

public class SortByDirectorName implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getDirectorname().compareTo(o2.getDirectorname());
	}

	
}
