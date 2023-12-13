package com.example.application_dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity {

    FrameLayout fm,fm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageButton IMG = (ImageButton) findViewById(R.id.logout);
        IMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }


        });

        fm = (FrameLayout) findViewById(R.id.Fav_Fram);
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, MainDashboard.class);
                startActivity(intent);
            }
        });

        fm1 = (FrameLayout) findViewById(R.id.detail);
        fm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, DetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openLoginActivity(){
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}