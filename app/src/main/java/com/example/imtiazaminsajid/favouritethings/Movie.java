package com.example.imtiazaminsajid.favouritethings;


public class Movie {
    private int movieID;
    private String movieName;
    private String movieYear;
    private String movieAbout;
    private int movieImg;


    public Movie(int movieID, String movieName, String movieYear, String movieAbout, int movieImg) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieAbout = movieAbout;
        this.movieImg = movieImg;

    }

    public Movie(int id, String name, String year, String about) {
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public Movie(String name, String movieName, String movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }
    public String getMovieAbout() {
        return movieAbout;
    }

    public int getMovieImg() {
        return movieImg;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public void setMovieAbout(String movieAbout) {
        this.movieAbout = movieAbout;
    }


    public void setMovieImg(int movieImg) {
        this.movieImg = movieImg;
    }

}
