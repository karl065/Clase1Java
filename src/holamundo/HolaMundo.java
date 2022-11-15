package holamundo;
import java.util.Scanner;

public class HolaMundo {


    public static void main(String[] args) {
        System.out.println("Hola Tripulantes, Somos imparables");
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
    
        System.out.println("Introduce el primer numero: ");
        numero1 = sc.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        numero2 = sc.nextInt();
        
        suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + suma);
        
        
        int k, metro, centi;
        
        System.out.println("Introduce el valor en Kilometros: ");
        k = sc.nextInt();
        
        metro = k * 1000;
        centi = metro * 100;
        
        System.out.println("El equivalente de\n" + k + " Kilomentros \nson "
        + metro + " metros y\n" + centi + " centimetros");
    }
    
}
