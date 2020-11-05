package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("Activity Flow", "onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Flow", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Flow", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Flow", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Flow", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Flow", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Flow", "onDestroy");
    }
}