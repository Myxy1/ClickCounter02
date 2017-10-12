package com.example.diak.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //VÁLTOZÓK LÉTREHOZÁSA
    private Button novel,csokkent,reset;
    private TextView szam;
    private int number = 0;
    private int kattintas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VÁLTOZÓK ÖSSZEKÖTÉSE A LAYOUTON TALÁLHATÓ WIDGETEKKEL
        novel = (Button) findViewById(R.id.btn_novel);
        csokkent = (Button) findViewById(R.id.btn_csokkent);
        reset = (Button) findViewById(R.id.btn_reset);
        szam = (TextView) findViewById(R.id.txv_szam);

        //NÖVELÉS ESEMÉNY LÉTREHOZÁSA
        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kattintas++;
                if (kattintas == 20){
                    Toast.makeText(MainActivity.this,"Unatkozol?!",Toast.LENGTH_LONG).show();
                }
                number++;
                szam.setText(""+number);
            }
        });

        //CSÖKKENTÉS ESEMÉNY LÉTREHOZÁSA
        csokkent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kattintas++;
                if (kattintas == 20){
                    Toast.makeText(MainActivity.this,"Unatkozol?!",Toast.LENGTH_LONG).show();
                }
                number--;
                szam.setText(""+number);
            }
        });

        //RESET ESEMÉNY LÉTREHOZÁSA
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kattintas = 0;
                number = 0;
                szam.setText(""+number);
            }
        });

    }
}
