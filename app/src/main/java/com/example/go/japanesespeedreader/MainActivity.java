package com.example.go.japanesespeedreader;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            TextView tv = (TextView) findViewById(R.id.SpeedReadTape);




    }

}