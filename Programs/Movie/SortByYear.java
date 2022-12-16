package Movie;

import java.util.Comparator;

public class SortByYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		if(o1.getreleasedyear()<o2.getreleasedyear())
		return 1;
		else if(o1.getreleasedyear()>o2.getreleasedyear())
			return -1;
		else
			return 0;
			
				
	}

}
