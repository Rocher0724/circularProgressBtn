package com.example.visualcamp.buttiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.dd.CircularProgressButton;

public class MainActivity extends AppCompatActivity {
  CircularProgressButton cb1;
  Button btn1, btn2, btn3, btn4;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    cb1 = (CircularProgressButton) findViewById(R.id.cb1);
    cb1.setIndeterminateProgressMode(true);
    cb1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (cb1.getProgress() == 0) {
          Log.e("뭘 타는걸까 " , "0");
          cb1.setProgress(50);
        } else if (cb1.getProgress() == 100) {
          Log.e("뭘 타는걸까 " , "100");
          cb1.setProgress(0);
        } else {
          Log.e("뭘 타는걸까 " , "any");
          cb1.setProgress(100);
        }
      }
    });

    btn1 = (Button) findViewById(R.id.btn1);
    btn1.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        cb1.setProgress(0);
      }
    });
    btn2 = (Button) findViewById(R.id.btn2);
    btn2.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        cb1.setProgress(50);
      }
    });
    btn3 = (Button) findViewById(R.id.btn3);
    btn3.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        cb1.setProgress(100);
      }
    });

    btn4 = (Button) findViewById(R.id.btn4);
    btn4.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        cb1.setProgress(-1);
      }
    });
  }
}
