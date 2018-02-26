package com.example.imtiazaminsajid.favouritethings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieListActivity extends AppCompatActivity {

    ListView mListview;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movies;
    MovieDatabaseSource movieDatabaseSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        mListview = findViewById(R.id.movieListviewLV);

        movieDatabaseSource = new MovieDatabaseSource(this);

        movies = movieDatabaseSource.getAllMovie();

        movieAdapter = new MovieAdapter(this, movies);
        mListview.setAdapter(movieAdapter);
    }
}
