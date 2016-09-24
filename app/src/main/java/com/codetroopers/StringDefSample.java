package com.codetroopers;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;

import com.codetroopers.blog_androidannotation.R;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StringDefSample extends AppCompatActivity {

    public static final String STRING_VALUE_1 = "Hello";
    public static final String STRING_VALUE_2 = "Code";
    public static final String STRING_VALUE_3 = "Troopers";

    @StringDef({
            STRING_VALUE_1,
            STRING_VALUE_2,
            STRING_VALUE_3
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface OnlyMyStringValues {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String result = getSomething(STRING_VALUE_1);
        result = getSomething("what ?");
    }


    public String getSomething(@OnlyMyStringValues String value) {
        switch (value) {
            case STRING_VALUE_1:
                return "You win";
            case STRING_VALUE_2:
                return "Draw";
            case STRING_VALUE_3:
                return "You lose";
        }
        return null;
    }


}
