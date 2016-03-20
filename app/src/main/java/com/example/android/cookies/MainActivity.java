package com.example.android.cookies;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Boolean troca = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eat_button_click (View view) {
        TextView texto = (TextView) findViewById(R.id.status_text_view);
        ImageView imagem = (ImageView) findViewById(R.id.android_cookie_image_view);
        Button botaoTexto = (Button) findViewById(R.id.eat_button);
        LinearLayout linear = (LinearLayout) findViewById(R.id.linear_layout);

        if (troca == false) {
            texto.setText("I´m so full!");
            imagem.setImageResource(R.drawable.after_cookie);
            linear.setBackgroundColor(getResources().getColor(R.color.colorRoxo));
            botaoTexto.setText("EAT AGAIN");
            troca=true;
        }else{
            texto.setText("I´m so hungry");
            imagem.setImageResource(R.drawable.before_cookie);
            botaoTexto.setText("EAT COOKIE");
            linear.setBackgroundColor(getResources().getColor(R.color.colorLilas));
            troca=false;

        }
    }
}
