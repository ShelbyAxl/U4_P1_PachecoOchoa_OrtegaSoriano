
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class DataBase {
    Connection conexion;
    Statement transaccion;
    ResultSet cursor;
    
    public DataBase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/U4_P1_PachecoOchoa_OrtegaSoriano?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            transaccion = conexion.createStatement();
        }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean Create(Producto pro){
        String SQL_Insert = "INSERT INTO PRODUCTOS VALUES(NULL, '%NOM%','%PRE%','%EXI%')";
        SQL_Insert = SQL_Insert.replaceAll("%NOM%", pro.nombre);
        SQL_Insert = SQL_Insert.replaceAll("%PRE%", pro.precio + "");
        SQL_Insert = SQL_Insert.replaceAll("%EXI%", pro.existencia + "");
        
        try {
            transaccion.execute(SQL_Insert);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    
    public ArrayList<String[]> Read(){
        ArrayList<String[]> tabla = new ArrayList<>();
        
        try {
            cursor = transaccion.executeQuery("SELECT * FROM PRODUCTOS");
            if(cursor.next()){
                do{
                    String[] row = { cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4)};
                    tabla.add(row);
                }while(cursor.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tabla;
    }
    
    public Producto queryID(String id){
        Producto ch = new Producto();
        try {
            cursor = transaccion.executeQuery("SELECT * FROM PRODUCTOS WHERE ID=" + id);
            if(cursor.next()){
                ch.nombre = cursor.getString(2);
                ch.precio = cursor.getString(3);
                ch.existencia = cursor.getString(4);
            }
            else return null;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ch;
    }
    
    public boolean update(Producto pro){   
        String update = "UPDATE PRODUCTOS SET NOMBRE='%NOM%', PRECIO='%PRE%', EXISTENCIA='%EXI%' WHERE ID=" + pro.id;
        update = update.replaceAll("%NOM%", pro.nombre);
        update = update.replaceAll("%PRE%", pro.precio);
        update = update.replaceAll("%EXI%", pro.existencia);
        
        try {
            transaccion.executeUpdate(update);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    public boolean delete(String id){
        try {
            transaccion.execute("DELETE FROM PRODUCTOS WHERE ID=" + id);
        } catch (SQLException ex) {
            return false;
        }
        
        return true;
    }
}
