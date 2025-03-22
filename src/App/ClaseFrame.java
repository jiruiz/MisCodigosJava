/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ClaseFrame extends JFrame {

    private JTextField txtConcepto, txtImporte;
    private JButton btnAgregar, btnActualizar, btnEliminar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ConceptoDAO dao;

    public ClaseFrame() {
        dao = new ConceptoDAO();

        setTitle("CRUD Concepto e Importe");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de entrada de datos
        JPanel panelTop = new JPanel();
        panelTop.setLayout(new GridLayout(2, 2));
        panelTop.add(new JLabel("Concepto:"));
        txtConcepto = new JTextField();
        panelTop.add(txtConcepto);
        panelTop.add(new JLabel("Importe:"));
        txtImporte = new JTextField();
        panelTop.add(txtImporte);
        add(panelTop, BorderLayout.NORTH);

        // Tabla de datos
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Concepto");
        modelo.addColumn("Importe");
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // Botones
        JPanel panelBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        add(panelBotones, BorderLayout.SOUTH);

        // Eventos de los botones
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarConcepto();
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarConcepto();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarConcepto();
            }
        });

        cargarDatos();
    }

    private void agregarConcepto() {
        String concepto = txtConcepto.getText();
        double importe = Double.parseDouble(txtImporte.getText());

        dao.insertar(concepto, importe);
        cargarDatos();
    }

    private void actualizarConcepto() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para actualizar");
            return;
        }

        int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        String concepto = txtConcepto.getText();
        double importe = Double.parseDouble(txtImporte.getText());

        dao.actualizar(id, concepto, importe);
        cargarDatos();
    }

    private void eliminarConcepto() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar");
            return;
        }

        // Asegurarse de que el valor de la primera columna sea el ID
        String idStr = modelo.getValueAt(fila, 0).toString();
        try {
            int id = Integer.parseInt(idStr);
            dao.eliminar(id);
            cargarDatos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID no es válido.");
        }
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        List<String[]> lista = dao.listar();
        for (String[] fila : lista) {
            modelo.addRow(fila);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClaseFrame ventana = new ClaseFrame();
            ventana.setVisible(true);
        });
    }
}
