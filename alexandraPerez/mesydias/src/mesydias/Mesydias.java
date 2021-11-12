/*
 El usuario introduce numero del mes "Mostrar el numero de mes y dias"
con switch
 */
package mesydias;

import java.util.Scanner;


public class Mesydias {

   
    public static void main(String[] args) {
        //Crear el objeto leer
        Scanner leer = new Scanner (System.in);
        
        //Variable
        String NombredelMes ="";
        
        System.out.println("Ingrese un numero del 1 al 12 : ");
        int num = leer.nextInt();
        
        //El usuario selecciono
       
        switch(num){
            case 1:
            NombredelMes = "Enero con 31 dias";
                break;
            case 2:
             NombredelMes = "Febrero con 28 dias";
                break;
            case 3:
            NombredelMes = "Marzo con 31 dias";
                break;
            case 4:
            NombredelMes = "Abril con 30 dias";
                break;
            case 5:
            NombredelMes = "Mayo con 31 dias";
                break;
            case 6:
            NombredelMes = "Junio con 30 dias";
                break;
            case 7:
            NombredelMes = "Julio con 31 dias";
                break;
            case 8:
            NombredelMes = "Agosto con 31 dias";
                break;
            case 9:
            NombredelMes = "Septiembre con 30 dias";
                break;
            case 10:
            NombredelMes = "Octubre con 31 dias";
                break;
             case 11:
            NombredelMes = "Noviembre con 30 dias";
                break;
            case 12:
            NombredelMes = "Diciembre con 31 dias";
                break; 
            default:
                  NombredelMes= "Ninguno"; 

     
        }
        
        //Mostrar mes seleccinado con el numero de dias
        System.out.println("Usted selecciono el mes :" + NombredelMes);
       
    }
    
}
