package com.codetroopers;

import android.support.annotation.StringRes;

import com.codetroopers.blog_androidannotation.R;

public class StringRefSample extends CallSuperSample {

    public void main() {
        buildWelcome(R.string.hello);
    }

    private String buildWelcome(@StringRes int stringId) {
        return getString(stringId, "john");
    }

}
