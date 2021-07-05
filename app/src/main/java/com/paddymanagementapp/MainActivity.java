package com.paddymanagementapp;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button getstarted = (Button) findViewById(R.id.getstarted);


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getstarted = (Button) findViewById(R.id.getstarted);
        getstarted.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              GETSTARTED();
            }
        });
    }

    public void GETSTARTED() {
        Intent intent = new Intent (MainActivity.this, datainputactivity.class);
        startActivity(intent);
    }





}
