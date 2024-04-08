package com.firouzi.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.firouzi.miu.MiuToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button btnW = findViewById(R.id.button2);
        Button btnS = findViewById(R.id.button3);
        Button btnI = findViewById(R.id.button4);
        ImageView imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.ERROR_TYPE,true, null).show();
            }
        });


        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.WARNING_TYPE,true, null).show();
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.SUCCESS_TYPE,true, null).show();
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.INFO_TYPE,true, null).show();
            }
        });



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiuToast.miu(MainActivity.this, "متن تست",MiuToast.LENGTH_LONG, MiuToast.CUSTOM_IMAGE_TYPE,true, R.drawable.images).show();
            }
        });
    }
}