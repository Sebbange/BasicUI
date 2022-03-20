package com.hansung.android.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean button_push = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new MyOnClickListener1());
//        btn1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), R.string.btn1_msg,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
        //strings.xml 안에 btn1_msg 내용 있음!
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new MyOnClickListener2());
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new MyOnClickListener3());
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button_push == true) {
                    btn1.setText("Button One");
                    button_push = false;
                } else {
                    btn1.setText("Button 1");
                    button_push = true;
                }
            }
        });

        Button btn5 = findViewById(R.id.button5);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayout2);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setGravity(Gravity.CENTER_HORIZONTAL);
            }
        });

    }

    class MyOnClickListener1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), R.string.btn1_msg,
                    Toast.LENGTH_SHORT).show();
        }
    }
    class MyOnClickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), R.string.btn2_msg,
                    Toast.LENGTH_SHORT).show();
        }
    }
    class MyOnClickListener3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), R.string.btn3_msg,
                    Toast.LENGTH_SHORT).show();
        }
    }
}