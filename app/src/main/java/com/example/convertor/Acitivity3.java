package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Acitivity3 extends AppCompatActivity {

    EditText t1;
    Spinner s1;
    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity3);
        t1 = (EditText) findViewById(R.id.editText);
        s1 = (Spinner) findViewById(R.id.spinner);
        T1 = (TextView) findViewById(R.id.textView);

    }

    public void Measurement(View v) {
        String s = s1.getSelectedItem().toString();
        if (s.equals("KiloMetre to Mile")) {
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.621);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Mile to KiloMetre")) {
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.621);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("KiloMetre to Metre")) {   //inr euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 1000);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Metre to KiloMetre")) {
            //euro to inr
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 1000);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("KiloMetre to Foot")) {
            //inr to pund
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 3280.84);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Foot to KiloMetre")) {
            //pound to inr
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 3280.84);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Metre to Mile")) {
            //dollar to euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.000621371);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Mile to Metre")) {  //euro to dollar
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.000621371);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Metre to Foot")) {//doolar to pound
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 3.280);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Foot to Metre")) {  //pound to dollar
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 3.280);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Foot to Mile")) {// pound to euro
            float a;
            a = Float.parseFloat(t1.getText().toString());
            a = (float) (a * 0.000189394);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        } else if (s.equals("Mile to Foot")) {//euro to pound
            float a = Float.parseFloat(t1.getText().toString());
            a = (float) (a / 0.000189394);
            String a1 = String.valueOf(a);
            T1.setText(a1);
        }
    }
}
