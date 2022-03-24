package com.example.contador2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 1;
    }

    public void incrementaContador (View vista){
        contador ++;
        mostrarResultado();
    }
    public void restaContador (View vista){
        contador --;
        mostrarResultado();
    }
    public void reseteaContador(View vista){
        contador=0;
        mostrarResultado();
    }

    public void mostrarResultado () {
        TextView textoResultado= (TextView)findViewById(R.id.contadorPulsaciones);
        //EN LA VARIABLE TEXTO RESULTADO ALMACENAREMSO UNA VISTA, UN TEXTO.
        //PARA LUEGO ESTABLECER A ESE OBJETO, QUE ES DE TIPO TEXTO, UN SET TEST.
                //ESTA ES LA RUTA
        //R: SON LOS RECURSOS QUE TIENE QUE CARGAR UNA APP ANTES DE CARGAR, ESTÁN
        //EN UN ARCHIVO DEL PROYECTO, ENTRE STOS RECURSOS ESTÁ EL TEXTO CONTACTORPULSACIONES
        //ESTÁ EN EDIT/ FIND/FIND /BUSCAR CONTADOR PULSACIONES
        textoResultado.setText("Contador: " + contador);

    }
 //en el último paso explica cómo crear un fichero APK para a través de un
    //vsb instalar la app en tu móvil, IMPORTANTE: decirle al mv que acepte
    //instalar apps de fuentes no confiables.Cualquier smartphone solo acepta
    //apps de google
}