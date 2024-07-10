package ProjectMovieRecommendation;

public class Movie {
    String title;
    String director;
    int releaseYear;
    double rating;
    int ratingCount;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getRatingCount() {
        return ratingCount;
    }


    void addRating(double newRating){
        double oldRating= getRating();
        int count=getRatingCount();
        double neww=((oldRating*count)+newRating)/(count+1);
        setRating(neww);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                '}';
    }


}
