package com.example.lab3a;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    private class Operator{

    }
    private int numOne;
    private int numTwo;
    public String operator;
    public String answer;

    private boolean newNum;


    public void numClick(View v) {
        String buttonText = ((Button) v).getText().toString();

      //  if (buttonText.equals(getString.(R.string.bC))) {
      //      resetCalc();
        }

     //   else if (buttonText.equals( getString(R.string.bSqr))) {

        }



    }

    private void resetCalc() {

    }



    public void equalClick(View v) {
        TextView e = (TextView) findViewById(R.id.textView);
        e.setText(answer);
    }

    private void setOperator(Operator o) {
      //  BigDecimal current = new BigDecimal(currentScreen)
    }

    void addDecimal {
       // if ( !currentScreen.contains"."


    }

    public void operatorClick(View v) {


        switch(operator) {
            case "+" :
                TextView p = (TextView) findViewById(R.id.textView);

                p.setText(String.valueOf(numOne) + "+" + String.valueOf(numTwo));
               // answer = numOne.add(numTwo);

               // setOperator(Operator.ADD);
                // new big decimal .negate()

            case "-" :
                TextView s = (TextView) findViewById(R.id.textView);

                s.setText(String.valueOf(numOne)+ "-" + String.valueOf(numTwo));

            case "*" :
                TextView m = (TextView) findViewById(R.id.textView);

                m.setText(String.valueOf(numOne)+ "*" +  String.valueOf(numTwo));

            case "÷" :
                TextView d = (TextView) findViewById(R.id.textView);

                d.setText(String.valueOf(numOne)+ "÷" +  String.valueOf(numTwo));


        }

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
