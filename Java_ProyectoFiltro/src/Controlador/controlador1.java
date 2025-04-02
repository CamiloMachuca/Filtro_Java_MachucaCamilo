/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.NinjaDAO;
import Vista.vista1;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class controlador1 {
    
    
    
    
    public void menu(){
        
        System.out.println("#########################");
        System.out.println("========= Menu =========");
        System.out.println("1. lista de ninjas ");
        System.out.println("2. buscar las misiones de un ninja");
        System.out.println("3. buscar las misiones completadas para un ninja especifico");
        System.out.println("4. Asignar una mision a un ninja");
        System.out.println("5. Marcar una mision como completada");
        System.out.println("6. Mostrar todas las misiones completadas");
        System.out.println("Ingrese la opcion deseada:");  
        Scanner teclado= new Scanner(System.in);
        String opcion= teclado.nextLine();
        
        switch (opcion) {
            case "1":
                System.out.println("La lista de ninjas es la siguiente");
                NinjaDAO ninj= new NinjaDAO();
                ninj.obtenerNinjas();
                
                break;
                
            case "2":
                NinjaDAO ninjadao=new  NinjaDAO();
                System.out.println("Ingrese el id del ninja para ver las misiones que puede realizar:");
                int iddd1= teclado.nextInt();
                ninjadao.MostrarMisiones(iddd1);
                break;
                
            case "3":
                NinjaDAO ninjadao2=new  NinjaDAO();
                System.out.println("Ingrese el id del ninja para saber que misiones ha completado:");
                int iddd= teclado.nextInt();
                ninjadao2.MisionesCompletadas(iddd);
                break;
            case "4":
                vista1 vist=new vista1();
                vist.agregarMision();
                break;
                
            
                
            default:
                throw new AssertionError();
        }
        

}
    
}
