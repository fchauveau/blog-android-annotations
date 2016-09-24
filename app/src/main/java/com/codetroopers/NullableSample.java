package com.codetroopers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.codetroopers.blog_androidannotation.R;

public class NullableSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String nameOne = getMyNameNullable().trim();
        String nameTwo = getMyNameNotNull().trim();
    }

    @NonNull
    public String getMyNameNotNull() {
        return null;
    }

    @Nullable
    public String getMyNameNullable() {
        return null;
    }

}
