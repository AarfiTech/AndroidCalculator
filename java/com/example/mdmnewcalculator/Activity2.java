package com.example.mdmnewcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

    public void mul(View v){
        EditText et1=(EditText) findViewById((R.id.editTextNumber));
        EditText et2=(EditText) findViewById(R.id.editTextNumber);
        int n1=Integer.parseInt(et1.getText().toString());
        int result= (int) (n1*8.45);
        et2.setText("total value" +result);




    }

}