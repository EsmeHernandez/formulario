package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,carrera, número;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.editNombre);
        carrera=(EditText)findViewById(R.id.editCarrera);
        número=(EditText)findViewById(R.id.editNúmero);
        aceptar=(Button) findViewById(R.id.btnaceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nombre.getText().toString();
                String carre=carrera.getText().toString();
                String núm=número.getText().toString();

              Intent v1= new Intent(MainActivity.this, MostrarDatos.class);

                v1.putExtra(name,"name");
                v1.putExtra(carre,"carrera");
                v1.putExtra(núm,"núm");
              startActivity(v1);
            }
        });
    }
}