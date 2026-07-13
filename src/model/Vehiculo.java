package model;

import interfaces.Registrable;

public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;

    public Vehiculo(String patente, String tipo) {
        this.patente = patente;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Patente de vehiculo: " + patente + " - Tipo de vehiculo: " + tipo);


    }
}
