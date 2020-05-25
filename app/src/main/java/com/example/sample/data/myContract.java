package com.example.sample.data;

import android.provider.BaseColumns;

public final class myContract {

    public static abstract class Entry implements BaseColumns{

        public static final String TABLE_NAME=" schemes";
        public static final String COLUMN_0_IDENTITY=BaseColumns._ID;
        //public static final String COUNT=BaseColumns._COUNT;
        public static final String COLUMN_1_SCHEME_LINK="scheme";
        public static final String COLUMN_2_TITLE="title";
        public static final String COLUMN_3_DISEASE="disease";
        public static final String COLUMN_4_STATE="state";
        public static final String COLUMN_5_GENDER="gender";

        //values for the style of headphones

        public static final int GENDER_MALE=0;
        public static final int GENDER_FEMALE=1;
    }
}

