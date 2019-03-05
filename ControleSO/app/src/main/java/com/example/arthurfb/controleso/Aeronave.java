package com.example.arthurfb.controleso;


public class Aeronave {
    private static int quantidade;
    private boolean aguardo;

    public static void somarAeronave() {
        quantidade += 1;
    }

    public static void subtrairAeronave() {
        quantidade -= 1;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void holdingAeronave() {

    }

    public void decolagemAeronave() {

    }

    public void pousoAeronave() {

    }
}
