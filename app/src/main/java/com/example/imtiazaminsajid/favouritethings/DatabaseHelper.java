package com.example.imtiazaminsajid.favouritethings;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Imtiaz Amin Sajid on 2/26/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Favourite Database";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "movies";
    public static final String COL_ID = "tbl_id";
    public static final String COL_NAME = "tbl_name";
    public static final String COL_YEAR = "tbl_year";
    public static final String COL_ABOUT_MOVIE = "tbl_about";


    public static final String CREATE_MOVIE_TABLE = "create table "+TABLE_NAME+"("+
            COL_ID+" integer primary key, "+
            COL_NAME+" text, "+
            COL_YEAR+" text, "+
            COL_ABOUT_MOVIE+" text);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_MOVIE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(CREATE_MOVIE_TABLE);
        onCreate(sqLiteDatabase);

    }
}
