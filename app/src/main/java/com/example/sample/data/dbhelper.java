package com.example.sample.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import androidx.annotation.Nullable;

import java.io.File;


public class dbhelper extends SQLiteOpenHelper {
    ///////////////////////////////////////////////////////
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME= "chinook.db";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final String comma=",";
    ///////////////////////////////////////////////////////
    public static final String key=" PRIMARY KEY";
    public static final String notnull=" NOT NULL";
    public static final String defalt=" DEFAULT ";
    public static final String unique=" UNIQUE";
    public static final String autoinc=" AUTOINCREMENT";
    ///////////////////////////////////////////////////////
    public static final String text_type=" TEXT";
    public static final String null_type=" NULL";
    public static final String integer_type=" INTEGER";
    public static final String real_type=" REAL";
    public static final String blob_TYPE=" BLOB";
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final String SQL_CREATE_ENTRIES="CREATE TABLE"+myContract.Entry.TABLE_NAME+
            " ("+
            myContract.Entry.COLUMN_0_IDENTITY+integer_type+key+comma+
            myContract.Entry.COLUMN_1_SCHEME_LINK+text_type+comma+
            myContract.Entry.COLUMN_2_TITLE+text_type+comma+
            myContract.Entry.COLUMN_3_DISEASE+text_type+comma+
            myContract.Entry.COLUMN_4_STATE+text_type+comma+
            myContract.Entry.COLUMN_5_GENDER+text_type+
            " );"  ;
    ///////////////////////////////////////////////////////
    public static final String SQL_DELETE_ENTRIES="DROP TABLE IF EXISTS"+myContract.Entry.TABLE_NAME;
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public dbhelper(@Nullable Context context) {
        super(context,Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator+"sample_db"+File.separator+DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
