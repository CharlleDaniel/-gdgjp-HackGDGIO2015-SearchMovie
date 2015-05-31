package com.searchmovie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Avaliar extends Activity implements View.OnClickListener {

    private ImageView ok;
    private ImageView star1;
    private ImageView star2;
    private ImageView star3;
    private ImageView star4;
    private ImageView star5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avaliar);
        acessView();

    }

    // capturar todas as views do layout referente a classe;
    public void acessView(){

        ok=(ImageView)findViewById(R.id.ok);
        star1=(ImageView)findViewById(R.id.s1);
        star2=(ImageView)findViewById(R.id.s2);
        star3=(ImageView)findViewById(R.id.s3);
        star4=(ImageView)findViewById(R.id.s4);
        star5=(ImageView)findViewById(R.id.s5);

        star1.setOnClickListener(this);
        star2.setOnClickListener(this);
        star3.setOnClickListener(this);
        star4.setOnClickListener(this);
        star5.setOnClickListener(this);
        ok.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {
        if(view.getId()==star1.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_off);
            star3.setImageResource(android.R.drawable.btn_star_big_off);
            star4.setImageResource(android.R.drawable.btn_star_big_off);
            star5.setImageResource(android.R.drawable.btn_star_big_off);
        }
        if(view.getId()==star2.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_off);
            star4.setImageResource(android.R.drawable.btn_star_big_off);
            star5.setImageResource(android.R.drawable.btn_star_big_off);
        }
        if(view.getId()==star3.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);
            star4.setImageResource(android.R.drawable.btn_star_big_off);
            star5.setImageResource(android.R.drawable.btn_star_big_off);
        }
        if(view.getId()==star4.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);
            star4.setImageResource(android.R.drawable.btn_star_big_on);
            star5.setImageResource(android.R.drawable.btn_star_big_off);
        }
        if(view.getId()==star5.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);
            star4.setImageResource(android.R.drawable.btn_star_big_on);
            star5.setImageResource(android.R.drawable.btn_star_big_on);
        }
        if(view.getId()==ok.getId()){
            finish();
        }

    }
}
