package com.example.imtiazaminsajid.favouritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddingMovies extends AppCompatActivity {
    EditText nameET, yearET, aboutET;
    Button addMovie, listMovie;
    private Movie movie;
    MovieDatabaseSource movieDatabaseSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_movies);

        nameET = findViewById(R.id.movieNameET);
        yearET = findViewById(R.id.movieYearET);
        aboutET = findViewById(R.id.movieAboutET);
        addMovie = findViewById(R.id.addMovieBT);
        listMovie = findViewById(R.id.listMovieBT);
        movieDatabaseSource = new MovieDatabaseSource(this);
    }

    public void addMovie(View view) {
        String name = nameET.getText().toString();
        String year = yearET.getText().toString();
        String about = aboutET.getText().toString();
        if(name.isEmpty()){
            nameET.setError("This Fild Must Not Be Empty");
        } else if (year.isEmpty()){
            yearET.setError("This Fild Must Not Be Empty");
        }
        else if (about.isEmpty()){
            aboutET.setError("This Fild Must Not Be Empty");
        }else {
            movie = new Movie(name, year, about);
            boolean status = movieDatabaseSource.addMovie(movie);
            if(status){
                Toast.makeText(this, "Successfully Added", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AddingMovies.this, MovieListActivity.class));
            }else {
                Toast.makeText(this, "Could Not Save", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void movieList(View view) {
        startActivity(new Intent(AddingMovies.this, MovieListActivity.class));
    }
}
