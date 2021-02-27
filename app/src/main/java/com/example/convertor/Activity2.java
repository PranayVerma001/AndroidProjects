package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText t1;
    Spinner s1;
    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t1 = (EditText) findViewById(R.id.editText);
        s1 = (Spinner) findViewById(R.id.spinner);
        T1 = (TextView) findViewById(R.id.textView);
    }

    public void currency(View v) {
        String s = s1.getSelectedItem().toString();
        if (s.equals("USD to INR")) {
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 74.66);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("INR to USD")) {
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 74.66);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("INR to EURO")) {   //inr euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.011);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("EURO to INR")) {
            //euro to inr
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.011);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("INR to POUND")) {
            //inr to pund
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.010);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("POUND to INR")) {
            //pound to inr
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.010);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("USD to EURO")) {
            //dollar to euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.84);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("EURO to USD")) {  //euro to dollar
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.84);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("USD to POUND")) {//doolar to pound
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.76);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("POUND to USD")) {  //pound to dollar
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.76);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("POUND to EURO")) {// pound to euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 1.11);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("EURO to POUND")) {//euro to pound
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 1.11);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        }
    }


}