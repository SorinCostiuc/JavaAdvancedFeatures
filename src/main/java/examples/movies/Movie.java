package examples.movies;

public abstract class Movie {
    int lengthInMinutes;
    String title;
    double rating;
    String director;
    boolean isUnderAge;

    public abstract String makeSound();


    public Movie(){

    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isUnderAge() {
        return isUnderAge;
    }

    public void setUnderAge(boolean underAge) {
        isUnderAge = underAge;
    }

}
