package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("==================================================");
        System.out.println("   LLANQUIHUE TOUR - RECORRIDO POLIMÓRFICO");
        System.out.println("==================================================");

        // Recorrido dinámico sin usar 'instanceof'
        for (ServicioTuristico servicio : gestor.obtenerServicios()) {
            servicio.mostrarInformacion();
        }
    }
}
