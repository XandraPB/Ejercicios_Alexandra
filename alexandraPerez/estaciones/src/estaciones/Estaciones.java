
 
package estaciones;


 
public class Estaciones {

    
    public static void main(String[] args) {
        
        //crear matriz
        String estaciones [][] = new String [2][2];
        
        //llenado de matriz
        estaciones [0][0]="OTONO";
        estaciones [0][1]="VERANO"; 
        estaciones [1][0]="INVIERNO";
        estaciones [1][1]="PRIMAVERA";
        
        //imprimir la matriz
        System.out.println("La estacion en la posicion (0,0) : " + estaciones [0][0]);
        System.out.println("La estacion en la posicion (0,1) : " + estaciones [0][1]);
        System.out.println("La estacion en la posicion (1,0) : " + estaciones [1][0]);
        System.out.println("La estacion en la posicion (1,1) : " + estaciones [1][1]);      
    }
    
}
