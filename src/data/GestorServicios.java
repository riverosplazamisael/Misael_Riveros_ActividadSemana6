package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void crearServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica("Sabores de Llanquihue", 4.5, 5);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Ruta del Kuchen", 3.0, 3);

        PaseoLacustre paseo1 =
                new PaseoLacustre("Lago Llanquihue", 2.5, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Bahía Frutillar", 1.5, "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural("Museo Colonial", 2.0, "Museo Colonial Alemán");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Puerto Varas Patrimonial", 3.0, "Iglesia del Sagrado Corazón");

        System.out.println(ruta1);
        System.out.println("\n-----------------\n");

        System.out.println(ruta2);
        System.out.println("\n-----------------\n");

        System.out.println(paseo1);
        System.out.println("\n-----------------\n");

        System.out.println(paseo2);
        System.out.println("\n-----------------\n");

        System.out.println(excursion1);
        System.out.println("\n-----------------\n");

        System.out.println(excursion2);
    }
}