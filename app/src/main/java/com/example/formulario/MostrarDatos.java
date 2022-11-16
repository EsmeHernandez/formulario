package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvcarrera, tvnúmero, tvcorreo, tvfecha;
    Button btnOK;
    private String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrardatos);

        tvnombre =(TextView)findViewById(R.id.tvNombre);
        tvcarrera =(TextView)findViewById(R.id.tvCarrera);
        tvnúmero =(TextView)findViewById(R.id.tvNúmero);
        //tvcorreo =(TextView)findViewById(R.id.tvCorreo);
       // tvfecha =(TextView)findViewById(R.id.tvFecha);

        btnOK =(Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MostrarDatos.this,MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarDatos();
    }

    private void mostrarDatos() {
        Bundle datos= this.getIntent().getExtras();
        String nombre=datos.getString(key, "name");
        String carrera=datos.getString(key, "carre");
        String número=datos.getString(key, "núm");
        String fecha=datos.getString(key, "fec");
        String correo=datos.getString(key, "corre");

        tvnombre.setText(nombre);
        tvcarrera.setText(carrera);
        tvnúmero.setText(número);
        tvfecha.setText(fecha);
        tvcorreo.setText(correo);

    }
}