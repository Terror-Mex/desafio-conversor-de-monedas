import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conversiones {
    private static final List<Almacenar> historial = new ArrayList<>();

    public static void convertir(Scanner scanner, String desde, String hacia, String textoDesde, String textoHacia) {
        System.out.println("Escribe el monto para convertir");
        double montoUsuario = Validator.leerMonto(scanner);
        Double resultado = ConexionApi.obtenerDatos(desde, hacia, montoUsuario);

        if (resultado != null) {
            System.out.printf("La conversión de %.2f %s a %s es: %.4f\n", montoUsuario, textoDesde, textoHacia, resultado);
            historial.add(new Almacenar(desde, hacia, montoUsuario, resultado));
        } else {
            System.out.println("No se pudo realizar la conversión, intenta más tarde");
        }
        System.out.println("Presiona Enter para continuar");
        scanner.nextLine();
    }

    public static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay historial de conversiones.");
        } else {
            System.out.println("Historial de conversiones:");
            for (Almacenar a : historial) {
                System.out.println(a);
            }
        }
    }
}