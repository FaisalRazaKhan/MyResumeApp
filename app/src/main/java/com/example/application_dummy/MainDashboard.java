package com.example.application_dummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDashboard extends AppCompatActivity {

    CardView cv,cv1,cv2,cv3,cv4,cv5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        btn = (Button) findViewById(R.id.backbtn);
        cv = (CardView) findViewById(R.id.langCard);
        cv1 = (CardView) findViewById(R.id.card1);
        cv2 = (CardView) findViewById(R.id.card2);
        cv3 = (CardView) findViewById(R.id.card3);
        cv4 = (CardView) findViewById(R.id.card4);
        cv5 = (CardView) findViewById(R.id.card5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, Dashboard.class);
                startActivity(intent);

            }
        });

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, JavaActivity.class);
                startActivity(intent);

            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, CSActivity.class);
                startActivity(intent);

            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, PythonActivity.class);
                startActivity(intent);

            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, XamlActivity.class);
                startActivity(intent);

            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, SqlActivity.class);
                startActivity(intent);

            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDashboard.this, CPPActivity.class);
                startActivity(intent);

            }
        });
    }
}