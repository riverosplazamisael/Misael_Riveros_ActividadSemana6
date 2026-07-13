package model;

import interfaces.Registrable;

public class GuiaTuristico implements Registrable {

    private String nombre;
    private String especialidad;


    public GuiaTuristico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Nombre guia: "+ nombre + " - Especialidad: " + especialidad);



    }
}
