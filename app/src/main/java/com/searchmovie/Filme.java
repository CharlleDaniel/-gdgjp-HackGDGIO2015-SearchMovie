package com.searchmovie;

/**
 * Created by Odravison on 30/05/2015.
 */
public class Filme {

    private String nomeDoFilme;
    private int tempoDeFilme;
    private String sinopseDoFilme;
    private double nota;
    private String comentarios;
    private String id;
    private int foto;

    public Filme(String nomeDoFilme, int tempoDeFilme, String sinopseDoFilme, double nota, String id, int foto) {
        this.nomeDoFilme = nomeDoFilme;
        this.tempoDeFilme = tempoDeFilme;
        this.sinopseDoFilme = sinopseDoFilme;
        this.nota = nota;
        this.id = id;
        this.foto = foto;
    }
    public Filme(){

    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getTempoDeFilme() {
        return tempoDeFilme;
    }

    public void setTempoDeFilme(int tempoDeFilme) {
        this.tempoDeFilme = tempoDeFilme;
    }

    public String getSinopseDoFilme() {
        return sinopseDoFilme;
    }

    public void setSinopseDoFilme(String sinopseDoFilme) {
        this.sinopseDoFilme = sinopseDoFilme;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

}
