package com.searchmovie;


import android.app.Activity;
<<<<<<< HEAD
=======
import android.app.Dialog;
>>>>>>> origin/master
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
<<<<<<< HEAD
=======


>>>>>>> origin/master
import java.util.List;



public class showFilme extends Activity implements View.OnClickListener {
    private TextView nameMovie;
    private ImageView photoMovie;
<<<<<<< HEAD
=======
    private TextView campSinopse;
>>>>>>> origin/master
    private Button sinopse;
    private Button avaliar;
    private ImageView star1;
    private ImageView star2;
    private ImageView star3;
    private ImageView star4;
    private ImageView star5;
<<<<<<< HEAD
    protected static Filme filme;
=======
    private Filme filme;
>>>>>>> origin/master

    private static final int SPEECH_REQUEST_CODE = 0;
    protected String spokenText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_filme);
<<<<<<< HEAD
        Inserts();
        displaySpeechRecognizer();// start captura da voz;
        acessView();
        showDataFilme();
=======

        Inserts();


        displaySpeechRecognizer();// start captura da voz;

        acessView();
        showFilme();
>>>>>>> origin/master

    }

   // capturar todas as views do layout referente a classe;
   public void acessView(){
        nameMovie= (TextView)findViewById(R.id.nomeFilme);
        photoMovie= (ImageView)findViewById(R.id.imageFilme);
        sinopse=(Button)findViewById(R.id.sinopse);
        avaliar=(Button)findViewById(R.id.avaliar);
        star1=(ImageView)findViewById(R.id.star1);
        star2=(ImageView)findViewById(R.id.star2);
        star3=(ImageView)findViewById(R.id.star3);
        star4=(ImageView)findViewById(R.id.star4);
        star5=(ImageView)findViewById(R.id.star5);

        sinopse.setOnClickListener(this);
        avaliar.setOnClickListener(this);
   }

// Create an intent that can start the Speech Recognizer activity
    private void displaySpeechRecognizer() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
// Start the activity, the intent will be populated with the speech text

        startActivityForResult(intent, SPEECH_REQUEST_CODE);
    }

// This callback is invoked when the Speech Recognizer returns.
// This is where you process the intent and extract the speech text from the intent.
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
    Intent data) {
        if (requestCode == SPEECH_REQUEST_CODE && resultCode == RESULT_OK) {
            List<String> results = data.getStringArrayListExtra(
                    RecognizerIntent.EXTRA_RESULTS);
            spokenText = results.get(0);
            // Do something with spokenText
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
<<<<<<< HEAD

    public void backIntent(View view){
        finish();
    }

    public void showDataFilme(){
=======
    public void backIntent(View view){
        finish();
    }
    public void showFilme(){
>>>>>>> origin/master
        nameMovie.setText(filme.getNomeDoFilme());
        photoMovie.setImageResource(filme.getFoto());
        showMedia(filme.getNota());


    }



    @Override
    public void onClick(View v) {
        if(v.getId()==avaliar.getId()){
            Intent it = new Intent(this,Avaliar.class);
            startActivity(it);
        }

        if(v.getId()==sinopse.getId()){
<<<<<<< HEAD
            Intent it = new Intent(this,Sinopse.class);
            startActivity(it);
=======
            Dialog d = new Dialog(this);
            d.setContentView(R.layout.sinopse);

            d.setTitle("Sinopse");
            d.setCancelable(true);
            d.show();
>>>>>>> origin/master
        }
    }

    // método só pra simular um filme
    public void Inserts(){
<<<<<<< HEAD
    String sinopse= "Vincent Vega (John Travolta) e Jules Winnfield (Samuel L. Jackson) são dois assassinos profissionais trabalham fazendo cobranças para \n" +
            "Marsellus Wallace (Ving Rhames), um poderosos gângster. Vega é forçado a sair com a garota do chefe, temendo passar dos limites; enquanto isso, o \n" +
            "pugilista Butch Coolidge (Bruce Willis) se mete em apuros por ganhar luta que deveria perder.";

        filme = new Filme("Pulp Fiction", 190,sinopse,4.3,"1", R.drawable.pulpfiction);
=======

        filme = new Filme("Pulp Fiction", 190,
                "Vincent Vega (John Travolta) e Jules Winnfield (Samuel L. Jackson) são dois assassinos \n" +
                        "profissionais trabalham fazendo cobranças para \n" +
                        "Marsellus Wallace (Ving Rhames), um poderosos \n" +
                        "gângster. \n" +
                        "Vega é forçado a sair com a garota do chefe, \n" +
                        "temendo passar dos limites; enquanto isso, o \n" +
                        "pugilista Butch Coolidge (Bruce Willis) se \n" +
                        "mete em apuros por ganhar luta que deveria perder.",4.3,
                "1", R.drawable.pulpfiction);
>>>>>>> origin/master



    }
    // método só pra colocar a quantidade de estrelas de cada filme baseado na sua media;
    public void showMedia(double nota){

        if(nota>=2 && nota<4){
            star1.setImageResource(android.R.drawable.btn_star_big_on);

        }
        if(nota>=4 && nota<6){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);

        }
        if(nota>=6 && nota<8){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);

        }
        if(nota>=8 && nota<10){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);
            star4.setImageResource(android.R.drawable.btn_star_big_on);

        }
        if(nota==10){
            star1.setImageResource(android.R.drawable.btn_star_big_on);
            star2.setImageResource(android.R.drawable.btn_star_big_on);
            star3.setImageResource(android.R.drawable.btn_star_big_on);
            star4.setImageResource(android.R.drawable.btn_star_big_on);
            star5.setImageResource(android.R.drawable.btn_star_big_on);
        }

    }


}
