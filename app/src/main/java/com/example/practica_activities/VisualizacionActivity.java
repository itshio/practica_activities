package com.example.practica_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class VisualizacionActivity extends AppCompatActivity {

    TextView visualizaciontvNombre;
    EditText visualizacionetOpinion, visualizacionEt_Valoracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizacion);


        visualizaciontvNombre= (TextView)findViewById(R.id.visual_tv_nombre);
        visualizacionetOpinion= (EditText)findViewById(R.id.visual_et_opinion);
        visualizacionEt_Valoracion= (EditText)findViewById(R.id.visual_et_valoracion);

        Bundle b= getIntent().getExtras();

        if(b!=null){

            Valoracion v = b.getParcelable(MainActivity.EXTRA_VALORACION);
            visualizaciontvNombre.setText(v.getNombre());
            visualizacionetOpinion.setText(v.getOpinion());
            visualizacionEt_Valoracion.setText(v.getValoracion());
        }

    }
}
