
import java.util.Scanner;
/**
 *
 * @author Alvaro 
 */
public class Main {
///////////Ejercicio 5/////////////////
     Scanner Datos = new Scanner(System.in);    
     
     int X, Y ;
     double M, N;
     
     public void Datos()
     {
     System.out.println("Ingrese el dato X");
     X = Datos.nextInt();
     System.out.println("Ingrese el dato Y");
     Y = Datos.nextInt();
     System.out.println("Ingrese el dato M");
     M = Datos.nextDouble();
     System.out.println("Ingrese el dato N");
     N = Datos.nextDouble();
     }
     
     public void MDatos()
     {
     System.out.println("Suma X + Y: " + X + Y);
     System.out.println(X - Y + ":Diferencia de X - Y");
     System.out.println("Multiplicacion X * Y: " + X * Y);
     System.out.println("Cociente X / Y: " + X / Y);
     System.out.println("Resto X % Y: " + X % Y);
     
     System.out.println("Suma N + M: " + N + M);
     System.out.println(N - M + " :Diferencia N - M ");
     System.out.println("Multiplicacion N * M: " + N * M);
     System.out.println("Cociente N / M: " +  N / M);
     System.out.println("Resto N % M: " + N % M);
     
     System.out.println("Suma de X + N: " +  X + N);
     System.out.println("Cociente de Y / M: " + Y / M);
     System.out.println("Resto de Y % M: " + Y % M);
     
     System.out.println("2 veces X: " + 2*X);
     System.out.println("2 veces Y: " + 2*Y);
     System.out.println("2 veces N: " + 2*N);
     System.out.println("2 veces M: " + 2*M);
     
     System.out.println("Suma de X+Y+M+N: " + X+Y+N+M);
     System.out.println("Multiplicacion de X*Y*M*N: " + X*Y*N*M);
     }
     
     public static void main(String [] args)
     {
         Main d = new Main();
         d.Datos();
        d.MDatos();
     }
}
