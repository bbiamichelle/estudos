package com.thoughtworks;

public class Forca {

    private String palavra;
    private int tentativas;

    public Forca (String palavra, int tentativas ){

        this.palavra = palavra;
        this.tentativas = tentativas;

    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
}
