package com.kevappsgaming.keraj.splashscreen;

import android.content.Intent;
import android.os.Bundle;

import com.kevappsgaming.keraj.R;
import com.kevappsgaming.keraj.activities.CameraActivity;
import com.kevappsgaming.keraj.activities.CameraActivityCat;
import com.kevappsgaming.keraj.activities.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);

        Thread myThread = new Thread(){
            @Override
            public void run(){

                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
