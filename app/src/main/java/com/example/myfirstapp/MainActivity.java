package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private EditText insertBirthDate;
    private Button button;
    private TextView showAge;

    private String ageSaved;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertBirthDate = findViewById(R.id.insertAge);
        button = findViewById(R.id.sendBtn);
        showAge= findViewById(R.id.showAge);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //cosa fare al tocco del click
                ageSaved =String.valueOf(insertBirthDate.getText());
                Log.d("MainActivity", String.valueOf(computeAge(Integer.getInteger(ageSaved))));
                showAge.setText(String.valueOf(computeAge(Integer.getInteger(ageSaved))));
            }
        });

    }

    private int computeAge (int birthDate ){
        return (Calendar.getInstance().getTime().getYear())-birthDate;
    }

}
