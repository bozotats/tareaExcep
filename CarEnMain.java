import java.util.Scanner;

public class CarEnMain {
    public static void main(String[] args) {
            Scanner consoleSc = new Scanner(System.in);
            System.out.println("introducir texto para checar el caracter en la posicion 7");
            String lectTeclado = consoleSc.nextLine();
            try {
                System.out.println("el septimo caracter es: " + CaracterEn.get(lectTeclado,7));
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            consoleSc.close();
    }
}
