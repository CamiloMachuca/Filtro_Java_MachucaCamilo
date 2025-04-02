/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import java.util.List;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Uniminuto Tibu
 */
public class NinjaDAO {
    private String URL="jdbc:mysql://bvqmimt3pciwu2nr7z4v-mysql.services.clever-cloud.com:3306/bvqmimt3pciwu2nr7z4v";
    private String USER="uuufwisysmk8ezl2";
    private String PASSWORD="UlXpfsb6Lda66N7JTxLJ";
    
   private Connection conectar() throws SQLException{
       return DriverManager.getConnection(URL, USER, PASSWORD);
   };
   
   
   public void obtenerNinjas(){
       String sql="select * from ninja n inner join habilidad h on n.id=h.id_ninja";
       List<String> listaNinjas=new ArrayList<>();
       try{
           Connection conec= conectar();
           PreparedStatement solicitud= conec.prepareStatement(sql);
           ResultSet resultado= solicitud.executeQuery();
           while(resultado.next()){
               listaNinjas.add(
                       "ID: "+
                       resultado.getInt("id")+ "\n Nombre: "+
                        resultado.getString("nombre")+ "\n Rango: "+
                        resultado.getString("rango")+"\n Aldea: "+
                        resultado.getString("aldea")+"\n Nombre Habilidad: "+
                        resultado.getString("nombreHabilidad")+"\n Descripcion: "+
                        resultado.getString("descripcion")
                               
                               );
           }
           for (String ninja: listaNinjas){
               System.out.println(ninja +"\n");
           }
           
       }catch (SQLException e){
           System.out.println(e);
       }
      
   }
   public void MostrarMisiones(int idNinja){
       String sql= "select * from ninja n inner join mision m on n.rango=m.rango where m.rango=n.rango and n.id="+ idNinja ;
       List<String> listaMisiones= new ArrayList<>();
       try{
           Connection conec= conectar();
           PreparedStatement solicitud= conec.prepareStatement(sql);
            solicitud.setInt(1, idNinja);
           ResultSet resultado= solicitud.executeQuery();
           
           while(resultado.next()){
               listaMisiones.add("ID_Mision"+ 
                       resultado.getInt("id_mision")+"\n Descripcion: "+
                       resultado.getString("descripcion")+"\n Rango Mision: "+
                       resultado.getString("rango")+"\n Recompensa: "+
                       resultado.getString("recompensa")
               
               
               );
                       
               
           }
           System.out.println("Lista de misiones");
           for (String mision: listaMisiones){
               System.out.println(mision +"\n");
           }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "no se pudo encontrar las misiones");
       }
   }
   
   public void MisionesCompletadas(int idNinja){
       String sql= "select * from misionNinja inner join ninja on misionNinja.id_ninja=? inner join mision on mision.id=misionNinja.id_mision where fechaFin !='2000-01-01'" ;
       List<String> listaMisiones= new ArrayList<>();
       try{
           Connection conec= conectar();
           PreparedStatement solicitud= conec.prepareStatement(sql);
           solicitud.setInt(1, idNinja);
           ResultSet resultado= solicitud.executeQuery();
           
           while(resultado.next()){
               listaMisiones.add("ID_Mision"+ 
                       resultado.getInt("id")+"\n Descripcion: "+
                       resultado.getString("descripcion")+"\n Rango Mision: "+
                       resultado.getString("rango")+"\n Recompensa: "+
                       resultado.getString("recompensa")+"\n Fecha Inicio: "+
                       resultado.getString("fechaInicio")+"\n fecha fin: "+
                       resultado.getString("fechaFin")
               
               );
                       
               
           }
           System.out.println("Lista de misiones");
           for (String mision: listaMisiones){
               System.out.println(mision +"\n");
           }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "no se pudo encontrar las misiones");
       }
   }
   
   public void agregarMision(misionNinja misininja){
       String sql="insert into misionNinja(id_ninja, id_mision, fechaInicio, fechaFin) values(?, ?,?,?)";
       try{
            Connection conec= conectar();
           PreparedStatement solicitud= conec.prepareStatement(sql);
           solicitud.setInt(1, misininja.getId_ninja());
           solicitud.setInt(2, misininja.getId_mision());
           solicitud.setString(3, misininja.getFechaInicio());
           solicitud.setString(4, misininja.getFechaFin());

           solicitud.executeUpdate();
           JOptionPane.showMessageDialog(null, "se añadoi correctamente al ninja");

       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se pudo añadir la mision al ninja");
  
       
       }
   }
   
    
    
}
