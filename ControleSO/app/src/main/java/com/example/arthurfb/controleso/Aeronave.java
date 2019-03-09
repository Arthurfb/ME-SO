package com.example.arthurfb.controleso;


public class Aeronave {
    private static int quantidade;
    private static int naPista;
    private static int noTaxi;
    private static int emHolding;
    private boolean aguardo;

    static CondicaoAdicao ad = new CondicaoAdicao();

    public static void somarAeronave() {
        while (noTaxi == 6 && naPista < 1) {
            ad.somaNaPista();
        }
        while (emHolding < 3 && naPista == 1) {
            ad.somaNoHolding();
        }
        while (noTaxi < 6 && naPista == 1 && emHolding == 3) {
            ad.somaNoTaxi();
        }
    }

    public static void subtrairAeronave() {
        ad.controleDaPista();
    }

    public static void setQuantidade(int quantidade) {
        Aeronave.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static int getNaPista() {
        return naPista;
    }

    public static void setNaPista(int naPista) {
        Aeronave.naPista = naPista;
    }

    public static int getNoTaxi() {
        return noTaxi;
    }

    public static void setNoTaxi(int noTaxi) {
        Aeronave.noTaxi = noTaxi;
    }

    public static int getEmHolding() {
        return emHolding;
    }

    public static void setEmHolding(int emHolding) {
        Aeronave.emHolding = emHolding;
    }
}
