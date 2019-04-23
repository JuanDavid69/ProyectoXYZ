/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Modelo.Venta;
import Controlador.*;
import java.sql.*;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class DaoVenta {
    DefaultTableModel tabla;
    FachadaBD fachada;
    DefaultTableModel tablaAux;
    ControlSedes controlSedes = new ControlSedes();
    ControlUsuario controlUsuario = new ControlUsuario();
    ControlInventario controlInventario = new ControlInventario();

    public DaoVenta() {
        fachada = new FachadaBD();
    }
    
    public String guardarVenta(Venta v){
        String sql_guardar;
        sql_guardar = "INSERT INTO ventas(id_venta, id_vendedor, fecha, total, id_sede) VALUES('" + 
                v.getId_venta() + "', '" + v.getId_vendedor() + "', '" + v.getFecha() + 
                "', " + v.getTotal() + ", '"+ v.getId_sede() +"')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Venta creada correctamente";
            }else{
                return "Error: No se insertó la venta";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe una venta con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear la venta";
        }        
    }
    
    public String[] consultarVenta(String id){
        String sql_select;        
        String consulta[] = new String[4];
        sql_select = "SELECT * FROM ventas WHERE id_venta = '" + id + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);
                consulta[2] = tabla.getString(3);
                consulta[3] = tabla.getString(4);  
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String modificarVenta(Venta v){
        String sql_modificar;
        sql_modificar = "UPDATE ventas SET id_vendedor='" + v.getId_vendedor() +
                "', fecha='" + v.getFecha() + "', total=" + v.getTotal() +
                " WHERE id_venta = '" + v.getId_venta() + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Venta modificada exitosamente";
            }else{
                return "No existe una venta con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la venta";
        }
    }
    
    public String eliminarVenta(String id){
        String sql_delete;
        sql_delete = "DELETE FROM ventas WHERE id_venta = '" + id + "'";
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Venta eliminada exitosamente";
            }else{
                return "No se eliminó la venta";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar la venta";
        }                             
    }
    
    public ArrayList cargarVentas(){
        String sql_select;
        ArrayList<String> ventas = new ArrayList<String>();
        int i = 0;
        sql_select = "SELECT id_venta FROM ventas";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            while(tabla.next()){
                ventas.add(tabla.getString(1));
                i++;  
            }
            return ventas;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel cargarInfoVentas(String busqueda){
        String [] Titulo = {"N° VENTA","CEDULA VENDEDOR","FECHA","TOTAL"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[4];
        sql_select = "SELECT * FROM ventas WHERE (id_venta) ilike '%" +busqueda + "%' ORDER BY id_venta";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(2);
                consulta[2] = rs.getString(3);
                consulta[3] = rs.getString(4);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public boolean verificarVenta(String id_producto, int peticion){
        String sql_select; 
        sql_select = "SELECT cantidad FROM inventario WHERE id_producto = '" + id_producto + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select); 
            
            if(tabla.next()){
                int valorActual = Integer.parseInt(tabla.getString(1));
                if(valorActual >= peticion){
                        return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
            return true;
        }
    }
    
    public String generarIdVenta(){
        String sql_select;        
        String id_venta = "001"; 
        sql_select = "SELECT MAX(id_venta) FROM ventas";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                if(tabla.getString(1) != null){
                    int codigo = Integer.parseInt(tabla.getString(1)) + 1;
                    if((codigo >= 100) && (codigo < 1000)){
                        id_venta = Integer.toString(codigo);
                    }
                    if((codigo >= 10) && (codigo < 100)){
                        id_venta = "0" + codigo;
                    }
                    if(codigo <= 9){
                        id_venta = "00" + codigo;
                    }
                }else{
                    id_venta = "001";
                }
            }else{
                id_venta = "001";
            }
            return id_venta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    //REPORTES
    
    public DefaultTableModel ventasSede(String start, String end){
        String [] Titulo = {"SEDE","NUMERO DE VENTAS"};
        tabla=new DefaultTableModel(null,Titulo);
        tablaAux = controlSedes.cargarSedes("" , "");
        try{
            for (int i=0; i<tablaAux.getRowCount(); i++){
                String sql_select;        
                String consulta[] = new String[2];
                consulta[0] = tablaAux.getValueAt(i, 1).toString();

                sql_select = "SELECT count(*) AS numero_ventas FROM ventas \n" +
                                "WHERE id_sede = '" + tablaAux.getValueAt(i, 0).toString() +"' AND \n"
                                    + "fecha BETWEEN '" + start + "'AND'" + end + "'group by id_sede";

                Connection conn= fachada.getConnetion();            
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql_select);

                if(rs.next()){
                    consulta[1] = rs.getString(1);
                    tabla.addRow(consulta);
                }else{
                    consulta[1] = "0";
                    tabla.addRow(consulta);
                }
            }

            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel ventasVendedor(String start, String end){
        String [] Titulo = {"VENDEDOR","NUMERO DE VENTAS"};
        tabla=new DefaultTableModel(null,Titulo);
        tablaAux = controlUsuario.cargarVendedores();
        try{
            for (int i=0; i<tablaAux.getRowCount(); i++){
                String sql_select;        
                String consulta[] = new String[2];
                consulta[0] = tablaAux.getValueAt(i, 0).toString() + " - " + tablaAux.getValueAt(i, 1).toString();

                sql_select = "SELECT count(*) AS numero_ventas FROM ventas \n" +
                                "WHERE id_vendedor = '" + tablaAux.getValueAt(i, 0).toString() +"' AND \n"
                                    + "fecha BETWEEN '" + start + "'AND'" + end + "'group by id_vendedor";
                
                Connection conn= fachada.getConnetion();            
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql_select);

                if(rs.next()){
                    consulta[1] = rs.getString(1);
                    tabla.addRow(consulta);
                }else{
                    consulta[1] = "0";
                    tabla.addRow(consulta);
                }
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel gananciasSedes(String start, String end){
        String [] Titulo = {"SEDE","GANANCIA TOTAL"};
        tabla=new DefaultTableModel(null,Titulo);
        tablaAux = controlSedes.cargarSedes("" , "");
        try{
            for (int i=0; i<tablaAux.getRowCount(); i++){
                String sql_select;        
                String consulta[] = new String[2];
                consulta[0] = tablaAux.getValueAt(i, 1).toString();

                sql_select = "SELECT SUM(total) AS ganacia FROM ventas \n" +
                                "WHERE id_sede = '" + tablaAux.getValueAt(i, 0).toString() +"' AND \n"
                                    + "fecha BETWEEN '" + start + "'AND'" + end + "'";
                
                Connection conn= fachada.getConnetion();            
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql_select);
                
                if(rs.next() && (rs.getString(1) != null)){
                    consulta[1] = rs.getString(1);
                    tabla.addRow(consulta);
                }else{
                    consulta[1] = "0";
                    tabla.addRow(consulta);
                }
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel productosVendidos(String start, String end){
        String [] Titulo = {"PRODUCTO","UNIDADES VENDIDAS"};
        tabla=new DefaultTableModel(null,Titulo);
        tablaAux = controlInventario.cargarInventario("");
        try{
            for (int i=0; i<tablaAux.getRowCount(); i++){
                String sql_select;        
                String consulta[] = new String[2];
                consulta[0] = tablaAux.getValueAt(i, 1).toString();

                sql_select = "SELECT SUM(cantidad) AS unidades_vendidas\n" +
                                "FROM carritoVen full join ventas on carritoVen.id_venta = ventas.id_venta\n" +
                                    "WHERE id_producto = '" + tablaAux.getValueAt(i, 0).toString() + "' AND fecha BETWEEN '"+ start +"' AND '"+ end +"'";
                       
                
                Connection conn= fachada.getConnetion();            
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql_select);
                
                if(rs.next() && (rs.getString(1) != null)){
                    consulta[1] = rs.getString(1);
                    tabla.addRow(consulta);
                }else{
                    consulta[1] = "0";
                    tabla.addRow(consulta);
                }
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel gananciaAnual(String year){
        String [] Titulo = {"MESES DE " + year,"GANACIA MENSUAL"};
        tabla=new DefaultTableModel(null,Titulo);
        ArrayList<String> meses = new ArrayList<String>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        try{
            for (int i=0; i<meses.size(); i++){
                String sql_select;        
                String consulta[] = new String[2];
                consulta[0] = meses.get(i);
                int j = i + 1;
                if(j<=9){
                    sql_select = "SELECT SUM(total) AS ganacia FROM ventas \n" +
                                    "WHERE TO_CHAR(fecha,'YYYY-MM')='" + year + "-0" + j + "';";
                }else{
                    sql_select = "SELECT SUM(total) AS ganacia FROM ventas \n" +
                                    "WHERE TO_CHAR(fecha,'YYYY-MM')='" + year + "-" + j + "';";
                }
                
                Connection conn= fachada.getConnetion();            
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql_select);
                
                if(rs.next() && (rs.getString(1) != null)){
                    consulta[1] = rs.getString(1);
                    tabla.addRow(consulta);
                }else{
                    consulta[1] = "0";
                    tabla.addRow(consulta);
                }
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
