package com.example.matthew.mvcproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    Button btnPrev;
    RadioGroup rbgPics;
    RadioButton rbPic1, rbPic2, rbPic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("MVC Project (2)");

        rbgPics = (RadioGroup)findViewById(R.id.pics_rbg);
        rbPic1 = (RadioButton)findViewById(R.id.firstRb_radio);
        rbPic2 = (RadioButton)findViewById(R.id.secondRb_radio);
        rbPic3 = (RadioButton)findViewById(R.id.thirdRb_radio);

        btnPrev = (Button) findViewById(R.id.previouspage_button);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
