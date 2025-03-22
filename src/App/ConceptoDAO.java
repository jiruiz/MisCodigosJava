/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juani
 */
public class ConceptoDAO {

    public void insertar(String concepto, double importe) {
        String sql = "INSERT INTO conceptos (concepto, importe) VALUES (?, ?)";

        try (Connection conn = ConexionDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, concepto);
            stmt.setDouble(2, importe);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> listar() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT * FROM conceptos";

        try (Connection conn = ConexionDB.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                // Aseguramos que el ID se esté recuperando como primera columna
                lista.add(new String[]{rs.getString("id"), rs.getString("concepto"), rs.getString("importe")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void actualizar(int id, String concepto, double importe) {
        String sql = "UPDATE conceptos SET concepto = ?, importe = ? WHERE id = ?";

        try (Connection conn = ConexionDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, concepto);
            stmt.setDouble(2, importe);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM conceptos WHERE id = ?";

        try (Connection conn = ConexionDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
