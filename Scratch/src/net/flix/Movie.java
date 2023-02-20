package net.flix;

public class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // Constructors
    public Movie() {
        // no-op
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        // delegate to setters for any validation/conversion they might be doing
        setTitle(title);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setRating(rating);
        setGenre(genre);
    }

    // business-oriented methods - deliberately omitted
    // play(), pause(), stop(), etc.

    // accessor methods (get/set methods)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toString()
    public String toString() {
        return String.format("Movie: title%s, releaseYear=%s, revenue=$%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//       return "Movie: title=" + getTitle() + ", releaseYear=" + getReleaseYear() +
//                ", revenue=" + getRevenue() + ", rating=" +getRating() + ", genre=" + getGenre();
    }

}