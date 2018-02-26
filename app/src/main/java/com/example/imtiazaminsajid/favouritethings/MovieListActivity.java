package com.example.imtiazaminsajid.favouritethings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MovieListActivity extends AppCompatActivity {

    ListView mListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        mListview = findViewById(R.id.movieListviewLV);
    }
}
