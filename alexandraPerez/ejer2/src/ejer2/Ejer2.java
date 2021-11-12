/*
 * Ejercicio 2:

Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y 
de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. 
A continuación, muestra por pantalla:
El valor de cada variable.
Variable X = 1, Variable Y = 2, Variable M = 3.2, Variable N = 4.7

 */
package ejer2;

/**
 *
 * @author Usuario
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X = 1, Y = 2;
        double M = 3.2, N = 4.7;
        System.out.println("Variable X = " + X);
        System.out.println("Variable Y = " + Y);
        System.out.println("Variable M = " + M);
        System.out.println("Variable N = " + N);
        System.out.println(X + " + " + Y + " = " + (X+Y));
        System.out.println(X + " - " + Y + " = " + (X-Y));
        System.out.println(X + " * " + Y + " = " + X*Y);
        System.out.println(X + " / " + Y + " = " + X/Y);
        System.out.println(X + " % " + Y + " = " + X%Y);
        System.out.println(N + " + " + M + " = " + (N+M));
        System.out.println(N + " - " + M + " = " +(X-Y));
        System.out.println(N + " * " + M + " = " + X*Y);
        System.out.println(X + " / " + M + " = " + X/Y);
        System.out.println(X + " % " + Y + " = " + X%Y);
        System.out.println("Variable X = " + X + " el doble es " + 2*X);
        System.out.println("Variable Y = " + Y + " el doble es " + 2*Y);
        System.out.println("Variable M = " + M + " el doble es " + 2*M);
        System.out.println("Variable N = " + N + " el doble es " + 2*N);
        System.out.println(X + " + " + Y + " + " + N + " + " + M + " = " + (X+Y+M+N));
        System.out.println(X + " * " + Y + " * " + N + " * " + M + " = " + (X*Y*M*N));
        
    }
    
}
