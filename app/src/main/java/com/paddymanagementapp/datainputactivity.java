package com.paddymanagementapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;



public class datainputactivity extends Activity {
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datainput);

        final EditText editName = (EditText) findViewById(R.id.editName);
        final EditText editLocation = (EditText) findViewById(R.id.editLocation);
        final EditText editSize = (EditText) findViewById(R.id.editSize);
        final RadioButton radioRent = (RadioButton) findViewById(R.id.radioRent);
        final RadioButton radioOwn = (RadioButton) findViewById(R.id.radioOwn);

        btnNext = (Button) findViewById(R.id.Next);
        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),datainputactivity_2.class);
                startActivity(i);

            }
        });


    }


}

