package Movie;

public class Movie {

		private String name;
		private String directorname;
		private int duration;
		private int releasedyear;
		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Movie(String name, String directorname, int duration, int releasedyear) {
			super();
			this.name = name;
			this.directorname = directorname;
			this.duration = duration;
			this.releasedyear = releasedyear;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDirectorname() {
			return directorname;
		}
		public void setDirectorname(String directorname) {
			this.directorname = directorname;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public int getreleasedyear() {
			return releasedyear;
		}
		public void setreleasedyear(int releasedyear) {
			this.releasedyear = releasedyear;
		}
		@Override
		public String toString() {
			return "Movie [name=" + name + ", directorname=" + directorname + ", duration=" + duration + ", releasedyear="
					+ releasedyear + "]\n";
		}

	}
