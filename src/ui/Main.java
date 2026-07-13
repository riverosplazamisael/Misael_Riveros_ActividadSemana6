package ui;

import data.GestorServicios;
import gui.Ventanatour;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();


        // Recorrido dinámico sin usar 'instanceof'
        for (ServicioTuristico servicio : gestor.obtenerServicios()) {
            servicio.mostrarInformacion();
        }

        new Ventanatour();



    }


}
