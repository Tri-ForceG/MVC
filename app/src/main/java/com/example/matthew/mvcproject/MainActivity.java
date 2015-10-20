package com.example.matthew.mvcproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSub, btnMul, btnDiv, btnNext;
    EditText lblNum1In, lblNum2In;
    TextView lblDisplay, lblNum1, lblNum2;
    double dNum1, dNum2, dAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("MVC Project");

        lblNum1 = (TextView) findViewById(R.id.num1_textView);
        lblNum2 = (TextView) findViewById(R.id.num2_textView2);

        lblNum1In = (EditText) findViewById(R.id.number1_editText);
        lblNum2In = (EditText)findViewById(R.id.number2_editText2);

        lblDisplay = (TextView)findViewById(R.id.display_textView);

        btnAdd = (Button) findViewById(R.id.add_button);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1In.getText().toString());
                dNum2 = Double.parseDouble(lblNum2In.getText().toString());
                dAnswer = dNum1 + dNum2;
                lblDisplay.setText(Double.toString(dAnswer));
            }
        });

        btnSub = (Button) findViewById(R.id.subtract_button);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1In.getText().toString());
                dNum2 = Double.parseDouble(lblNum2In.getText().toString());
                dAnswer = dNum1 - dNum2;
                lblDisplay.setText(Double.toString(dAnswer));
            }
        });

        btnMul = (Button) findViewById(R.id.multiply_button);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1In.getText().toString());
                dNum2 = Double.parseDouble(lblNum2In.getText().toString());
                dAnswer = dNum1 * dNum2;
                lblDisplay.setText(Double.toString(dAnswer));
            }
        });

        btnDiv = (Button) findViewById(R.id.divide_button);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1In.getText().toString());
                dNum2 = Double.parseDouble(lblNum2In.getText().toString());
                dAnswer = dNum1 / dNum2;
                lblDisplay.setText(Double.toString(dAnswer));
            }
        });

        btnNext = (Button) findViewById(R.id.nextpage_button);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
