/*se necesita crear un vector estatico de tipo double que tenga como resultado 
utiles escolares. 
Imprimiendo en pantalla:
listado de precios de utiles escolares
lapicera $ 40.5
cuaderno $ 139.99
cartuchera $ 560.5
mochila $ 1399.99
 */
package utilesescolares221021;


 
public class UtilesEscolares221021 {

    
    public static void main(String[] args) {
    String utiles [] = {"Lapicera", "Cuaderno", "Cartuchera", "Mochila"};
    double precios [] = {40.5, 139.99, 560.5, 1399.99};
    System.out.println("Listado de presios de los utiles escolares");
        
        for (int i=0;i<utiles.length;i++){
            System.out.println(utiles[i] + " $ " + precios [i]);
        }
    }    
}
