package com.example.victorhugo.ado5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Button1,Button2,Button3,Button4,Button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button1 = (Button)findViewById(R.id.button);
        Button2 = (Button)findViewById(R.id.button2);
        Button3 = (Button)findViewById(R.id.button3);
        Button4 = (Button)findViewById(R.id.button4);
        Button5 = (Button)findViewById(R.id.button5);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela1.class);
                startActivity(abreCadastro);

            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela2.class);
                startActivity(abreCadastro);

            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela3.class);
                startActivity(abreCadastro);

            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela4.class);
                startActivity(abreCadastro);

            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent abreCadastro = new Intent(MainActivity.this, tela5.class);
                startActivity(abreCadastro);

            }
        });
    }
}
