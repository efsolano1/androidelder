package com.example.user.union;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_nuevo;
    Button btn_2;
    Button btn_sinc;
    Button btn_cam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_nuevo=(Button) findViewById(R.id.bt1);
        btn_nuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent
                        (MainActivity.this, Nuevo.class);
                startActivity(intent);
            }
            });

        btn_2=(Button) findViewById(R.id.bt3);
        btn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent
                        (MainActivity.this, lista.class);
                startActivity(intent1);
            }
        });

        btn_sinc=(Button) findViewById(R.id.bt2);
        btn_sinc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent
                        (MainActivity.this, Sincronizar.class);
                startActivity(intent1);
            }
        });
        btn_cam=(Button) findViewById(R.id.bt4);
        btn_cam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent
                        (MainActivity.this, Camara.class);
                startActivity(intent1);
            }
    });
    }
}
