package com.codetroopers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;

public class RequirePermissionSample extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        usePhoneCamera();
    }

    @RequiresPermission(CAMERA_SERVICE)
    public void usePhoneCamera() {
        // open camera
    }
}
