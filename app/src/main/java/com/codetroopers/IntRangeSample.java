package com.codetroopers;

import android.support.annotation.IntRange;

public class IntRangeSample extends CallSuperSample {

    protected void main() {
        doWhatYouWant(1);
        doWhatYouWant(5);
    }

    private String doWhatYouWant(@IntRange(from = 0, to = 2) int value) {
        switch (value) {
            case 0:
                return "noop";
            case 1:
                return "hello world";
            case 2:
                return "You win";
        }
        return null;
    }
}
