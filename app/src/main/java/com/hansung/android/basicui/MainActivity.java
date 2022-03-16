package com.hansung.android.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new ClickListener());
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new ClickListener());
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new ClickListener());
//        Button btn4 = findViewById(R.id.button4);
//        btn4.setOnClickListener(new ClickListener());
//        Button btn5 = findViewById(R.id.button5);
//        btn5.setOnClickListener(new ClickListener());
//        Button btn6 = findViewById(R.id.button6);
//        btn6.setOnClickListener(new ClickListener());
    }

    class ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), R.string.msg,
                    Toast.LENGTH_SHORT).show();
        }
    }
}