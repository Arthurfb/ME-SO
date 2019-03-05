package com.example.arthurfb.controleso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button mSoma;
    private Button mSubtracao;

    TextView holding;
    TextView taxing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoma = findViewById(R.id.soma);
        mSubtracao = findViewById(R.id.subtracao);

        mSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aeronave.somarAeronave();
                exibirQuantidade();
            }
        });

        mSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aeronave.subtrairAeronave();
                exibirQuantidade();
            }
        });
    }

    public void exibirQuantidade() {
        Aeronave q = new Aeronave();
        q.getQuantidade();
        holding = findViewById(R.id.dado_holding);
        holding.setText(String.valueOf(q));

    }
}
