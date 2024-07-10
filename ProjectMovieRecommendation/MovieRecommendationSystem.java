package ProjectMovieRecommendation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieRecommendationSystem {

    List<Movie> movieList;

    public MovieRecommendationSystem() {
        this.movieList= new ArrayList<>();
    }

    public void addMovie(String title, String director, int releaseYear) {

        Movie movie = new Movie(title, director, releaseYear);
        movieList.add(movie);
    }

    void rateMovie(String title, double rating) {
        for (Movie var : movieList) {
            if (var.title.equalsIgnoreCase(title)) {
                var.addRating(rating);
                int count=var.getRatingCount();
                var.setRatingCount(count+1);

            }
        }
    }

    void searchMovie(String title) {
        for (Movie var : movieList) {
            if (var.title.equalsIgnoreCase(title)) {
                System.out.println(var);
            }
        }
    }

    void displayMovies() {
        for (Movie var : movieList) {
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        MovieRecommendationSystem system = new MovieRecommendationSystem();
        Scanner in = new Scanner(System.in);
        boolean toContinue=true;
        while (toContinue) {
            System.out.println("1.Add Movie");
            System.out.println("2.Rate Movie");
            System.out.println("3.Search Movie");
            System.out.println("4.Display Movies");
            System.out.println("5.Exit");
            System.out.println("Enter you choice(in numbers)");
            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the title");
                    in.nextLine();
                    String title = in.nextLine();
                    System.out.println("Enter the name of Director");
                    String director = in.nextLine();
                    System.out.println("Enter the release year");
                    int releaseYear = in.nextInt();
                    system.addMovie(title, director, releaseYear);
                    System.out.println("Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter the title");
                    in.nextLine();
                    title = in.nextLine();
                    System.out.println("Enter the rating");
                    double rate = in.nextFloat();
                    system.rateMovie(title, rate);
                    break;

                case 3:
                    System.out.println("Enter the title");
                    in.nextLine();
                    title = in.nextLine();
                    system.searchMovie(title);
                    break;

                case 4:
                    system.displayMovies();
                    break;

                case 5:
                    toContinue=false;

                default:
                    System.out.println("Enter valid details");
                    break;
            }

        }

    }
}