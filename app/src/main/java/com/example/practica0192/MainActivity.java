package com.example.practica0192;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnPulsar;
    private EditText txtNombre;
    private TextView lblSaludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // relaccionar los objetos
        btnPulsar = (Button) findViewById(R.id.btnSaludar);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        lblSaludar = (TextView) findViewById(R.id.lblSaludo);
        // codificar el evento clic del boton

        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // validar

                if(txtNombre.getText().toString().matches("")){

                    Toast.makeText(MainActivity.this,
                            "Falto capturar informacion",
                            Toast.LENGTH_SHORT).show();
                }
                else {

                    String str = " Hola "
                            + txtNombre.getText().toString() +
                            " ¿ Como estas ?";
                    lblSaludar.setText(str.toString());
                }
            }
        });

    }
}