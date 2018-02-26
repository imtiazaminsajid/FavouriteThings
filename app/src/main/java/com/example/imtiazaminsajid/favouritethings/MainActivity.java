package com.example.imtiazaminsajid.favouritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button movie, food, songs, place, books;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie = findViewById(R.id.movies);
        food = findViewById(R.id.food);
        songs = findViewById(R.id.songs);
        place = findViewById(R.id.place);
        books = findViewById(R.id.books);


    }


    public void movies(View view) {
        startActivity(new Intent(MainActivity.this, AddingMovies.class));
    }

    public void food(View view) {
    }

    public void place(View view) {
    }

    public void songs(View view) {
    }

    public void books(View view) {
    }
}
