package Controladores;

import Modelos.Modelo_Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class control_Ventas {

    public Modelo_Venta registrarVenta(double montoKiosco, double montoComida, double montoPanaderia, double montoTotal, String hora, String detalle) {
        Modelo_Venta venta = new Modelo_Venta();
        String sql = "INSERT INTO Venta(detalle, montoKiosco, montoComida, montoPanaderia, montoTotal, horaVenta) values (?, ?, ?, ?, ?, ?)";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, detalle);
            pst.setDouble(2, montoKiosco);
            pst.setDouble(3, montoComida);
            pst.setDouble(4, montoPanaderia);
            pst.setDouble(5, montoTotal);
            pst.setString(6, hora);

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id = generatedKeys.getInt(1);
                        venta.setId(id);
                        venta.setTipo(detalle);
                        venta.setMontoKiosco(montoKiosco);
                        venta.setMontoComida(montoComida);
                        venta.setMontoPanaderia(montoPanaderia);
                        venta.setMontoTotal(montoTotal);
                        venta.setHora(hora);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al registrar la venta: " + e.getMessage());
        }
        return venta;
    }

}
