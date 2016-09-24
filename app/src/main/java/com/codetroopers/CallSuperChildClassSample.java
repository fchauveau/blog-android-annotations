package com.codetroopers;

import android.os.Bundle;

import com.codetroopers.blog_androidannotation.R;

public class CallSuperChildClassSample extends CallSuperSample {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mySuperMethod() {


    }
}
