package data;

import java.util.ArrayList;
import java.util.List;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import interfaces.Registrable;
import model.Vehiculo;
import model.*;

public class GestorServicios {

    private List<ServicioTuristico> servicios;
    private List<Registrable> entidades;


    public GestorServicios(List<Registrable> entidades) {
        this.entidades = new ArrayList<>();
        cargarEntidades();

    }

    public GestorServicios() {
        this.servicios = new ArrayList<>();
        this.entidades = new ArrayList<>();

        cargarServicios();
        cargarEntidades();
    }



    private void cargarServicios() {

        servicios.add(new RutaGastronomica("Sabores del Lago", 4.5, 5));
        servicios.add(new PaseoLacustre("Navegación Frutillar", 2.0, "Catamarán"));
        servicios.add(new ExcursionCultural("Colonos Alemanes", 5.0, "Museo Regional"));
        servicios.add(new RutaGastronomica("Ruta del Chocolate", 3.0, 3));
        servicios.add(new PaseoLacustre("Aventura Ensenada", 1.5, "Lancha Motor"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }

    private void cargarEntidades() {
        entidades.add(new GuiaTuristico("Claudio Pinto", "Escalador"));
        entidades.add(new Vehiculo("ZVHG-24", "Jeep" ));
        entidades.add(new ColaboradorExterno("Benjamin Perez", "Asistente guia"));
        entidades.add(new GuiaTuristico("Alfredo salas", "trekking"));
        entidades.add(new Vehiculo("VCWL-74", "Camioneta"));
        entidades.add(new ColaboradorExterno("Marcelo Osorio", "Conductor"));

    }

    public void agregarEntidades(GuiaTuristico guiaTuristico, Vehiculo vehiculo, ColaboradorExterno colaboradorExterno){
        entidades.add(guiaTuristico);
        entidades.add(vehiculo);
        entidades.add(colaboradorExterno);

    }

    public void recorrerEntidades(){
        for (Registrable entidad : entidades){
            entidad.mostrarResumen();

            if (entidad instanceof GuiaTuristico g){
                System.out.println("  -> Especialidad: " + g.getEspecialidad());
            }else if (entidad instanceof Vehiculo v){
                System.out.println(" -> Tipo de vehiculo: " + v.getTipo());
            }
            }


        }
    public List<Registrable> getEntidades() {
        return entidades;
    }

    }

