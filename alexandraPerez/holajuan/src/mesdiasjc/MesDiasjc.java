
package mesdiasjc;

import java.util.Scanner;

public class MesDiasjc {

    
    public static void main(String[] args){
        // Crear objeto
        Scanner leer = new Scanner (System.in);
        //Mostrar mensaje ingresar mes
        System.out.println("Ingrese um mes: ");
        
        String mes = leer.nextLine();
        int diasMes = 0;
        String numMes;
        
        switch (mes)
        {
            case "Enero": numMes = "1";
            break;
            case "Febrero": numMes = "2";
            break;
            case "Marzo": numMes = "3";
            break;
            case "Abril": numMes = "4";
            break;
            case "Mayo": numMes = "5";
            break;
            case "Junio": numMes = "6";
            break;
            case "Julio": numMes = "7";
            break;
            case "Agosto": numMes = "8";
            break;
            case "Septiembre": numMes = "9";
            break;
            case "Octubre": numMes = "10";
            break;
            case "Noviembre": numMes = "11";
            break;
            case "Diciembre": numMes = "12";
            break; 
            default: numMes = "Ingreso invalido";
        }
        
        
        switch (mes)
        {
        case "Enero":    
        case "Marzo": 
        case "Mayo": 
        case "Julio": 
        case "Agosto": 
        case "Octubre": 
        case "Diciembre":
            diasMes = 31;
        break;
        case "Abril": 
        case "Junio": 
        case "Septiembre":
        case "Noviembre":   
            diasMes = 30;
        break;            
        case "Febrero":
            diasMes = 28;
        break;              
        }
        //Mostrar informacion denumero de mes y dias por mes
        
        System.out.println("Ingreso el mes " + mes + ", es el mes " + numMes + " y tiene " + diasMes + " dias.");
        
        
        
    }
}

