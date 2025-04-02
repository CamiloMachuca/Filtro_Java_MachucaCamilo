/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.NinjaDAO;
import Modelo.misionNinja;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class vista1 {
    Scanner teclado= new Scanner(System.in);
    public int buscarMisiones(){
        System.out.println("Ingrese el id del ninja a buscarle las misiones: ");
        
        int idBusqueda=teclado.nextInt();
        return idBusqueda;
    }
    public void agregarMision(){
        misionNinja misio=new misionNinja();
        System.out.println("Ingrese el id del ninja que le va a asignar la mision");
        int idd =teclado.nextInt();
        misio.setId_ninja(idd);
        System.out.println("ingrese el id de la mision");
        int idMision= teclado.nextInt();
        teclado.nextLine();
        misio.setId_mision(idMision);
        System.out.println("Ingrese la fecha de inicio");
        String fechaInicio= teclado.nextLine();
        misio.setFechaInicio(fechaInicio);
        System.out.println("Ingrese la fecha de final");
        String fechafinal= teclado.nextLine();
        misio.setFechaInicio(fechafinal);
        NinjaDAO ninj=new NinjaDAO();
        
        ninj.agregarMision(misio);
    }
    
}
