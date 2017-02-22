package com.example.android.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {


    private EditText cajaNombre;  // txt donde se ingresa el texto  txt tipo -> EditText
    private TextView cajaMensaje;  // label donde se mostrara el mensaje lbl tipo -> TextView



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNombre = (EditText) findViewById(R.id.txtNombre);
        cajaMensaje = (TextView) findViewById(R.id.lblMensaje);
    }

    //Método del botón siempre, public void y parametros View v,  Importar alt + Enter
    public void Saludar(View v){
        String aux;
        aux =cajaNombre.getText().toString();
        cajaMensaje.setText(getResources().getString(R.string.parte_saludo)+ " " + aux);
    }

}
