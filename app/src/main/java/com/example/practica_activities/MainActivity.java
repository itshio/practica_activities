package com.example.practica_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_VALORACION = "VALORACION";

    EditText etnombre,etopinion;
    Spinner spvaloracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnombre=(EditText)findViewById(R.id.main_txt_nombre);
        etopinion=(EditText)findViewById(R.id.main_txt_opinion);
        spvaloracion=(Spinner)findViewById(R.id.main_sp_valoracion);

        String[] valoracion ={"","1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter<String> adaptador_valoracion= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,valoracion);

        spvaloracion.setAdapter(adaptador_valoracion);




    }


    public void Clickaceptar (View view){

        String nombre = etnombre.getText().toString();
        String cajaopinion = etopinion.getText().toString();
        String valoracion = spvaloracion.getSelectedItem().toString();

        if(nombre.equals("")|| cajaopinion.equals("")|| valoracion.equals("")){

            Toast.makeText(getApplicationContext(),"Debes rellenar algo",Toast.LENGTH_LONG).show();


        }else{

            int numerovaloracion = Integer.parseInt(valoracion);


            Valoracion valoraciones = new Valoracion(nombre,cajaopinion,numerovaloracion);

            Intent i=new Intent(getApplicationContext(),VisualizacionActivity.class);
            i.putExtra(EXTRA_VALORACION,valoraciones);

            startActivity(i);






        }


    }



}
