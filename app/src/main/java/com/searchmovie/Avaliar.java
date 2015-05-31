package com.searchmovie;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CharlleNot on 30/05/2015.
 */
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




    }



    public void onClick(View view) {
        if(view.getId()==star1.getId()){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
        }
    }
}
