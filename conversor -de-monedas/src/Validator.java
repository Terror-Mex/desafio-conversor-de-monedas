import java.util.Scanner;

public class Validator {

    public static double leerMonto(Scanner scanner) {
        double monto;

        while (true) {
            if(!scanner.hasNextDouble()) {
                System.out.println("Monto no válido. Introduce un número (ej. 123.45):");
                scanner.next();
                continue;
            }

            monto = scanner.nextDouble();
            if (monto <= 0) {
                System.out.println("El monto debe ser mayor que cero. Intenta de nuevo:");
                continue;
            }
            break;
        }
        return monto;
    }

}
