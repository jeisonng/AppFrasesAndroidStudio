package com.example.jeison.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void frase(View view){
        TextView text= findViewById(R.id.frase);
        String[] frases={"O importante não é vencer todos os dias, mas lutar sempre."
                 ,"Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!"
                 ,"É melhor conquistar a si mesmo do que vencer mil batalhas."
                 ,"Enquanto houver vontade de lutar haverá esperança de vencer."
                 ,"Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto."
                 ,"O medo de perder tira a vontade de ganhar."
                 ,"Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança."
                 ,"Escolher o seu tempo é ganhar tempo."
                 ,"Arriscamo-nos a perder quando queremos ganhar demais."
                 ,"Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo."
                 ,"Perder para a razão, sempre é ganhar."
                 ,"Se você pretende ser rico, pense em economizar tanto quanto em ganhar."
                 ,"O homem digno ganha para viver; o menos honesto vive para ganhar."
                 ,"Para ganhar aquilo que vale a pena ter, pode ser necessário perder tudo mais."
                 ,"Não basta conquistar a sabedoria, é preciso usá-la."
                 ,"De que serve ao homem conquistar o mundo inteiro se perder a alma?"};
        int aleatorio = new Random().nextInt(frases.length);
        text.setText(frases[aleatorio]);
    }
}
