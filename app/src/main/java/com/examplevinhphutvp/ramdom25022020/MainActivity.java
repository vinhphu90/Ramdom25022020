package com.examplevinhphutvp.ramdom25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Math
        // Lam tron
 //       Double a =1.99;
 //       long value = Math.round(a);
 //       Log.d("BBB",String.valueOf(a));
        // Lam tron len
 //       double value1 = Math.ceil(a);
        // lam tron xuong
 //       double value2 = Math.floor(a);
 //       Log.d("BBB",String.valueOf(value2));
        // can hai
 //       double b = 9;
 //       double vaLue = Math.sqrt(b);
 //       Log.d("BBB",String.valueOf(vaLue));
        // tinh so max va min
 //       int a = 5;
 //       int b = 6;
 //       int value = Math.max(a,b);
 //       Log.d("BBB",String.valueOf(value));
        double value = Math.floor(Math.random() * 6);
        Log.d("BBB",String.valueOf(value));
    }
}
