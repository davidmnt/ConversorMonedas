package com.example.conversormonedas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ConversorMonedasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_monedas);
        Spinner despl1 = findViewById(R.id.desplegable1);
        Spinner despl2 = findViewById(R.id.desplegable2);
        Button boton7 = findViewById(R.id.siete);
        Button boton8 = findViewById(R.id.ocho);
        Button boton9 = findViewById(R.id.nueve);
        Button boton4= findViewById(R.id.cuatro);
        Button boton5 = findViewById(R.id.cinco);
        Button boton6 = findViewById(R.id.seix);
        Button boton1 = findViewById(R.id.uno);
        Button boton2 = findViewById(R.id.dos);
        Button boton3 = findViewById(R.id.tres);
        Button botonComa = findViewById(R.id.coma);
        Button boton0 = findViewById(R.id.cero);
        Button botonIgual = findViewById(R.id.igual);
        Button botonAC = findViewById(R.id.AC);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.arrMonedas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        despl1.setAdapter(adapter);
        despl2.setAdapter(adapter);

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton7.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton8.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero7 = boton9.getText().toString();
                pantalla.setText(pantalla.getText() + numero7);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton4.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton5.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton6.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton1.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton2.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton3.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitarCero(pantalla);
                String numero = boton0.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dividir = botonDividir.getText().toString();
                pantalla.setText(pantalla.getText() + dividir);

            }
        });
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Multi = botonMulti.getText().toString();
                pantalla.setText(pantalla.getText() + Multi);

            }
        });
        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resta = botonRestar.getText().toString();
                pantalla.setText(pantalla.getText() + resta);

            }
        });
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mas = botonSuma.getText().toString();
                pantalla.setText(pantalla.getText() + mas);

            }
        });
        botonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero7 = boton7.getText().toString();
                pantalla.setText(pantalla.getText() + numero7);

            }
        });



    }
}