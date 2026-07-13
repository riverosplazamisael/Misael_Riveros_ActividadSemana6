package model;

import interfaces.Registrable;

public class ColaboradorExterno implements Registrable {
    private String nombre;
    private String rol;


    public ColaboradorExterno(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public void mostrarResumen() {
        System.out.printf("Nombre colaborador: " + nombre + " - Rol colaborador: " + rol);



    }
}
