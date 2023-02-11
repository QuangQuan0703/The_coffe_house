package com.example.huhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);
//        tv = (TextView) findViewById(R.id.hello);
//        tv.setText("set up text View");
        Log.d("StraningAndroid", "on Create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Stranning Android", "on Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Stranning Android", "on Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Stranning Android", "on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Stranning Android", "on Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Stranning Android", "on Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}