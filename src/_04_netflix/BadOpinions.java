package _04_netflix;

public class BadOpinions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie spaceballs = new Movie("Space Balls", 4);
		Movie cinderella = new Movie("Cinderella", 4);
		Movie angry = new Movie("Angry Birds 1", 100000000);
		Movie lion = new Movie("Lion King", 1);
		Movie alvin = new Movie("Alvin and the Chipmunks", 300000000);
		spaceballs.getTicketPrice();
		cinderella.getTicketPrice();
		angry.getTicketPrice();
		lion.getTicketPrice();
		alvin.getTicketPrice();
		NetflixQueue tuff = new NetflixQueue();
		tuff.addMovie(spaceballs);
		tuff.addMovie(cinderella);
		tuff.addMovie(angry);
		tuff.addMovie(lion);
		tuff.addMovie(alvin);
		tuff.printMovies();
		System.out.println("The best movie in this queue is "+tuff.getBestMovie());
		System.out.println("The second best movie in this queue is "+ tuff.getSecondBestMovie());
		
	}

}
