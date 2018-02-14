package com.example.practica_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etnombre,etopinion;
    Spinner spvaloracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnombre=(EditText)findViewById(R.id.main_txt_nombre);
        etopinion=(EditText)findViewById(R.id.main_txt_opinion);
        spvaloracion=(Spinner)findViewById(R.id.main_sp_valoracion);
























    }
}
