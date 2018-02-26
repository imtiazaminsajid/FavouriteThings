package com.example.imtiazaminsajid.favouritethings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

        this.close();

        if(id>0){
            return true;
        }
        else {
            return false;
        }

    }

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie>movies = new ArrayList<>();
        this.open();


       Cursor cursor = sqLiteDatabase.rawQuery("select * from "+DatabaseHelper.TABLE_NAME,null);
       cursor.moveToFirst();
       if(cursor != null && cursor.getCount()>0){
           for(int i = 0; i<cursor.getCount();i++);
           int i = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COL_ID));
           String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_NAME));
           String year = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_YEAR));
           String about = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_ABOUT_MOVIE));

           movie = new Movie(i, name, year, about);
           movies.add(movie);
           cursor.moveToNext();
       }

       cursor.close();
       this.close();
       return movies;

    }
}
