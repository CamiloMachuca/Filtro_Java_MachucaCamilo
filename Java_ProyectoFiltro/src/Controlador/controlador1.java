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
        boolean buclePrincipal=true;
        while (buclePrincipal){
        System.out.println("#########################");
        System.out.println("========= Menu =========");
        System.out.println("#########################");
        System.out.println("1. lista de ninjas con sus habilidades ");
        System.out.println("2. buscar las misiones de un ninja");
        System.out.println("3. buscar las misiones completadas para un ninja especifico");
        System.out.println("4. Asignar una mision a un ninja");
        System.out.println("5. Marcar una mision como completada");
        System.out.println("6. Mostrar todas las misiones completadas");
        System.out.println("7. Salir del programa");
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
                vista1 viss=new vista1();
 
                NinjaDAO ninjadao=new  NinjaDAO();                     
                int iddd1= viss.buscarMisiones();;
                ninjadao.MostrarMisiones(iddd1);
                break;
                
            case "3":
                NinjaDAO ninjadao2=new  NinjaDAO();
                vista1 viss1=new vista1();
                int iddd2= viss1.misionesRealizadasNi();
                ninjadao2.MisionesCompletadas(iddd2);
                break;
            case "4":
                vista1 vist=new vista1();
                vist.agregarMision();
                break;
            case "5":
                NinjaDAO ninjadao3=new  NinjaDAO();
                ninjadao3.MisionesSinCompletar();
                vista1 vistaa=new vista1();
                vistaa.finalizarMision();
                break;
                
            case "6":
                NinjaDAO ninjadao4=new  NinjaDAO();
                ninjadao4.MisionesCompletadasTodaas();
                break;
            case "7":
                System.out.println("Se salio del programa");
                buclePrincipal=false;
                break;
                
            
                
            default:
                throw new AssertionError();
        }
        }
        

}
    
}
