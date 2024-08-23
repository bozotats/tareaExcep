import java.math.*;
import java.util.Scanner;

public class NumNegMain {
    
    static void displaySqrtOf(float inNumber) throws NumeroNegativoException {
        if (inNumber < 0) {
            throw new NumeroNegativoException("Este numero no tiene raiz cuadrada al ser negativo.", new Throwable("Numero introducido = " + inNumber));
        
        } else {
            System.out.println("la raiz cuadrada es: " + Math.sqrt(inNumber));
        }
        
    }

    public static void main(String[] args) {
        Scanner sysInSc = new Scanner(System.in);
        System.out.println("introduzca un numero al cual mostrar su raiz cuadrada");
        float numero = sysInSc.nextFloat();

        try {
            displaySqrtOf(numero);

        } catch (NumeroNegativoException e) {
            System.out.println("excepcion atrapada");
            System.out.println("Hubo una excepcion: " + e);
        }

        System.out.println("fin del programa");
    }
}
