package com.example.imtiazaminsajid.favouritethings;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Imtiaz Amin Sajid on 2/26/2018.
 */

public class MovieDatabaseSource {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase sqLiteDatabase;
    private Movie movie;

    public MovieDatabaseSource(Context context) {
        databaseHelper = new DatabaseHelper(context);


    }
    public void open(){

        sqLiteDatabase = databaseHelper.getWritableDatabase();

    }

    public void close(){

    }

    public boolean addMovie(Movie movie){
        this.open();
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COL_NAME,movie.getMovieName());
        values.put(DatabaseHelper.COL_YEAR,movie.getMovieYear());
        values.put(DatabaseHelper.COL_ABOUT_MOVIE,movie.getMovieAbout());

        long id = sqLiteDatabase.insert(DatabaseHelper.TABLE_NAME,null, values);

        if(id>0){
            return true;
        }
        else {
            return false;
        }

    }

//    public ArrayList<Movie> getAllMovie(){
//
//    }
}
