package com.example.conversormonedas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversorMonedasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_monedas);
        Spinner despl1 = findViewById(R.id.desplegable1);
        Spinner despl2 = findViewById(R.id.desplegable2);
        EditText pantalla = findViewById(R.id.pantalla);
        TextView pantalla1 = findViewById(R.id.resultadoMonedas);
        Button boton7 = findViewById(R.id.siete);
        Button boton8 = findViewById(R.id.ocho);
        Button boton9 = findViewById(R.id.nueve);
        Button boton4= findViewById(R.id.cuatro);
        Button boton5 = findViewById(R.id.cinco);
        Button boton6 = findViewById(R.id.seix);
        Button boton1 = findViewById(R.id.uno);
        Button boton2 = findViewById(R.id.dos);
        Button boton3 = findViewById(R.id.tres);
        //Button botonComa = findViewById(R.id.coma);
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
                String numero = boton7.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton8.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero7 = boton9.getText().toString();
                pantalla.setText(pantalla.getText() + numero7);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton4.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton5.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton6.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton1.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton2.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton3.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = boton0.getText().toString();
                pantalla.setText(pantalla.getText() + numero);

            }
        });

        botonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
            }
        });


        /*botonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numeroComa = botonComa.getText().toString();
                pantalla.setText(pantalla.getText() + numeroComa);
                double numConComa = 0;

                for()

            }
        });*/



        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String monedaCambio1;
                String monedaCambio2;

                //EUROS
                final double EUROSDOLAR = 1.05;
                final double EUROSYEN = 157.82;
                final double EUROSPESOS = 369.2;
                final double EUROSLIBRA = 0.86;

                //YEN
                final double YENDOLAR = 0.00668;
                final double YENPESOS = 2.33957;
                final double YENLIBRA = 0.0055;
                final double YENEURO = 0.00636;

                //LIBRA
                final double LIBRAYEN = 181.557;
                final double LIBRAPESOS = 424.983;
                final double LIBRADOLAR = 1.21413;
                final double LIBRAEURO = 1.15483;

                //DOLAR
                final double DOLARYEN = 149.543;
                final double DOLARPESOS = 350.03;
                final double DOLARLIBRA = 0.82305;
                final double DOLAREURO = 0.95132;

                //PESOS
                final double PESOSYEN = 0.42719;
                final double PESOSDOLAR = 0.00286;
                final double PESOSLIBRA = 0.00235;
                final double PESOSEURO = 0.00272;

                double numPantalla = cogerCifra(pantalla);
                double resultNumerico = 0;
                String resultString = "";

                monedaCambio1 = (String) despl1.getSelectedItem();
                monedaCambio2 = (String) despl2.getSelectedItem();


                switch (monedaCambio1) {

                    //EUROS A OTRA MONEDA
                    case "Euros":
                        switch (monedaCambio2) {
                            case "Dolar":
                                resultNumerico = numPantalla * EUROSDOLAR;
                                break;
                            case "Yens":
                                resultNumerico = numPantalla * EUROSYEN;
                                break;
                            case "Libra":
                                resultNumerico = numPantalla * EUROSLIBRA;
                                break;
                            case "Pesos(Argentinos)":
                                resultNumerico = numPantalla * EUROSPESOS;
                                break;
                        }
                        break;

                    //DOLAR A OTRA MONEDA
                    case "Dolar":
                        switch (monedaCambio2) {
                            case "Euros":
                                resultNumerico = numPantalla * DOLAREURO;
                                break;
                            case "Yens":
                                resultNumerico = numPantalla * DOLARYEN;
                                break;
                            case "Libra":
                                resultNumerico = numPantalla * DOLARLIBRA;
                                break;
                            case "Pesos(Argentinos)":
                                resultNumerico = numPantalla * DOLARPESOS;
                                break;
                        }
                        break;

                    //YEN A OTRA MONEDA
                    case "Yens":
                        switch (monedaCambio2) {
                            case "Euros":
                                resultNumerico = numPantalla * YENEURO;
                                break;
                            case "Dolar":
                                resultNumerico = numPantalla * YENDOLAR;
                                break;
                            case "Libra":
                                resultNumerico = numPantalla * YENLIBRA;
                                break;
                            case "Pesos(Argentinos)":
                                resultNumerico = numPantalla * YENPESOS;
                                break;
                        }
                        break;

                    //LIBRA A OTRA MONEDA
                    case "Libra":
                        switch (monedaCambio2) {
                            case "Euros":
                                resultNumerico = numPantalla * LIBRAEURO;
                                break;
                            case "Dolar":
                                resultNumerico = numPantalla * LIBRADOLAR;
                                break;
                            case "Yens":
                                resultNumerico = numPantalla * LIBRAYEN;
                                break;
                            case "Pesos(Argentinos)":
                                resultNumerico = numPantalla * LIBRAPESOS;
                                break;
                        }
                        break;

                    //PESOS A OTRA MONEDA
                    case "Pesos(Argentinos)":
                        switch (monedaCambio2) {
                            case "Euros":
                                resultNumerico = numPantalla * PESOSEURO;
                                break;
                            case "Dolar":
                                resultNumerico = numPantalla * PESOSDOLAR;
                                break;
                            case "Yens":
                                resultNumerico = numPantalla * PESOSYEN;
                                break;
                            case "Libra":
                                resultNumerico = numPantalla * PESOSLIBRA;
                                break;
                        }
                        break;
                }

                resultString = resultNumerico + "";
                pantalla1.setText(numPantalla + " " + monedaCambio1 + " " + resultString + " " + monedaCambio2);


            }
        });



    }

    private static double cogerCifra(EditText pantalla) {

        //Creamos varias variables

        String result = "";
        String resultPantalla = String.valueOf(pantalla.getText());
        double resultNum = 0;

        char[] num = resultPantalla.toCharArray();

        for (int i = 0; i < num.length; i++) {
            result += num[i];

        }
        resultNum = Integer.parseInt(result);

        return resultNum;
    }

}