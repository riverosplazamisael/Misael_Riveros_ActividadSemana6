package data;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class GestorServicios {
    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    private void cargarServicios() {
        // Carga polimófica de 5 objetos combinados (Requisito Paso 2)
        servicios.add(new RutaGastronomica("Sabores del Lago", 4.5, 5));
        servicios.add(new PaseoLacustre("Navegación Frutillar", 2.0, "Catamarán"));
        servicios.add(new ExcursionCultural("Colonos Alemanes", 5.0, "Museo Regional"));
        servicios.add(new RutaGastronomica("Ruta del Chocolate", 3.0, 3));
        servicios.add(new PaseoLacustre("Aventura Ensenada", 1.5, "Lancha Motor"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }
}
