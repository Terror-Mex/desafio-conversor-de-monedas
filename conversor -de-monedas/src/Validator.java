import java.util.Scanner;

public class Validator {

    public static double leerMonto(Scanner scanner) {
        double monto;

        while (true) {
            String entrada = scanner.nextLine().trim();
            try {
                monto = Double.parseDouble(entrada);
                if (monto <= 0) {
                    System.out.println("El monto debe ser mayor que cero. Intenta de nuevo:");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Monto no válido. Asegúrate de ingresar un número");
            }
        }
        return monto;
    }

    public static int leerOpcion(Scanner scanner) {
        int opcionUsuario;

        while (true) {
            String opcion = scanner.nextLine().trim();
            try {
                opcionUsuario = Integer.parseInt(opcion);

                if (opcionUsuario > 8 || opcionUsuario < 1) {
                    System.out.println("Entrada no válida. Por favor, escriba un número del 1 al 7.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe de ser un número del 1 al 7");
            }
        }
            return opcionUsuario;
    }

}
