package com.searchmovie;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Sinopse extends Activity{
    TextView campSinopse;
    private Filme filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinopse);
        campSinopse=(TextView)findViewById(R.id.campSinopse);
        filme=showFilme.filme;

        campSinopse.setText(filme.getSinopseDoFilme());

    }
}
