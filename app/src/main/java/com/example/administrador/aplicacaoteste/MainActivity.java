package com.example.administrador.aplicacaoteste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button botao = (Button)findViewById(R.id.botaoMaroto);
        CheckBox checkIndefinido = (CheckBox)findViewById(R.id.checkBoxIndefinido);
        botao.setText("btnMaroto teste");
        checkIndefinido.setText("Check Teste");
        botao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Cacete de Agulha", Toast.LENGTH_LONG).show();
            }
        });

    }
}