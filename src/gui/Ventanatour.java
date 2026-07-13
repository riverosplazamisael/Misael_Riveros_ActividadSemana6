package gui;

import data.GestorServicios;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import interfaces.Registrable;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;

public class Ventanatour extends JFrame {

    private JComboBox<String> cmbTipo;
    private JTextField txtNombre;
    private JTextField txtDato;
    private JTextArea txtArea;

    private GestorServicios gestor;

    public Ventanatour() {

        gestor = new GestorServicios();

        setTitle("Llanquihue Tour - Registro de Entidades");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();

        setVisible(true);
    }

    private void inicializarComponentes() {

        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));

        cmbTipo = new JComboBox<>();
        cmbTipo.addItem("Guía Turístico");
        cmbTipo.addItem("Vehículo");
        cmbTipo.addItem("Colaborador Externo");

        txtNombre = new JTextField();
        txtDato = new JTextField();

        JButton btnGuardar = new JButton("Guardar");
        JButton btnLimpiar = new JButton("Limpiar");

        panelFormulario.add(new JLabel("Tipo de entidad:"));
        panelFormulario.add(cmbTipo);

        panelFormulario.add(new JLabel("Nombre / Patente:"));
        panelFormulario.add(txtNombre);


        panelFormulario.add(new JLabel("Especialidad / Tipo / Rol:"));
        panelFormulario.add(txtDato);

        panelFormulario.add(btnGuardar);
        panelFormulario.add(btnLimpiar);

        add(panelFormulario, BorderLayout.NORTH);

        txtArea = new JTextArea();
        txtArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtArea);

        add(scroll, BorderLayout.CENTER);

        btnGuardar.addActionListener(e -> guardarEntidad());

        btnLimpiar.addActionListener(e -> {
            txtNombre.setText("");
            txtDato.setText("");
        });
    }

    private void guardarEntidad() {

        String tipo = cmbTipo.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        String dato = txtDato.getText();

        if (nombre.isEmpty() || dato.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe completar todos los campos."
            );

            return;
        }

        if (tipo.equals("Guía Turístico")) {

            GuiaTuristico guia =
                    new GuiaTuristico(nombre, dato);

            gestor.getEntidades().add(guia);

        } else if (tipo.equals("Vehículo")) {

            Vehiculo vehiculo =
                    new Vehiculo(nombre, dato);

            gestor.getEntidades().add(vehiculo);

        } else {

            ColaboradorExterno colaborador =
                    new ColaboradorExterno(nombre, dato);

            gestor.getEntidades().add(colaborador);
        }

        mostrarEntidades();

        txtNombre.setText("");
        txtDato.setText("");
    }

    private void mostrarEntidades() {

        txtArea.setText("");

        for (Registrable entidad : gestor.getEntidades()) {

            if (entidad instanceof GuiaTuristico) {

                GuiaTuristico guia = (GuiaTuristico) entidad;

                txtArea.append(
                        "Guía: " +
                                guia.getNombre() +
                                " | Especialidad: " +
                                guia.getEspecialidad() +
                                "\n"
                );

            } else if (entidad instanceof Vehiculo) {

                Vehiculo vehiculo = (Vehiculo) entidad;

                txtArea.append(
                        "Vehículo: " +
                                vehiculo.getPatente() +
                                " | Tipo: " +
                                vehiculo.getTipo() +
                                "\n"
                );

            } else if (entidad instanceof ColaboradorExterno) {

                ColaboradorExterno colaborador =
                        (ColaboradorExterno) entidad;

                txtArea.append(
                        "Colaborador: " +
                                colaborador.getNombre() +
                                " | Rol: " +
                                colaborador.getRol() +
                                "\n"
                );
            }
        }
    }
}