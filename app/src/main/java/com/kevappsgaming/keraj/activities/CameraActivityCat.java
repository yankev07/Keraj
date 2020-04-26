package com.kevappsgaming.keraj.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kevappsgaming.keraj.R;
import com.kevappsgaming.keraj.fragments.CameraFragment;
import com.kevappsgaming.keraj.fragments.CameraFragmentCat;

public class CameraActivityCat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_cat);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraFragmentCat.newInstance())
                    .commit();
        }
    }
}
