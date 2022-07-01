package de.telran;

public class Movies {

    String movieName;
    String genre;
    double rating;
    int year;

    public Movies(String movieName, String genre, double rating, int year) {
        this.movieName = movieName;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
