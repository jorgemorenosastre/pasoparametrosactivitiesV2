package com.example.pasoparametrosactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pasoparametrosactivities.beans.Usuario;
import com.example.pasoparametrosactivities.datos.SeasData;

public class Pantalla1Activity extends AppCompatActivity {
    private EditText edtUser;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        edtUser = (EditText) findViewById(R.id.edtUsuario);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navegarEntrePantallas = new Intent(getBaseContext(), Pantalla2Activity.class);
                //navegarEntrePantallas.putExtra("USUARIO", edtUser.getText().toString());

                Usuario miUsuario = new Usuario();
                miUsuario.setEmail(edtUser.getText().toString());

                //navegarEntrePantallas.putExtra("USUARIO", miUsuario);

                SeasData.setUsuario(miUsuario);
                startActivity(navegarEntrePantallas);

            }
        });
    }
}