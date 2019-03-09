package com.example.arthurfb.controleso;

public class CondicaoAdicao {

    Aeronave aero = new Aeronave();

    int naPista = aero.getNaPista();
    int noTaxi = aero.getNoTaxi();
    int noHolding = aero.getEmHolding();

    public void somaNaPista() {
        while (naPista < 1) {
            naPista += 1;
        }
    }

    public void somaNoTaxi() {
        while (noTaxi < 6) {
            noTaxi += 1;
        }
    }

    public void somaNoHolding() {
        while (noHolding < 3) {
            noHolding += 1;
        }
    }

    public void controleDaPista() {
        while (naPista == 1 && noHolding == 3 && noTaxi == 6) {
            naPista -= 1;
            noHolding -= 1;
            somaNaPista();
            naPista -= 1;
            noTaxi -= 1;
            somaNaPista();
        }
    }

}
