import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionUsuario = 0;

        while (opcionUsuario != 8) {

            System.out.println(""" 
                    *********************************
                    Bienvenido(a) al convertidor de monedas
                    
                    1) Dolar a           --->  Peso mexicano
                    2) Peso mexicano a   --->  Dolar
                    3) Dolar a           --->  Peso argentino
                    4) Peso argentino a  --->  Dolar
                    5) Dolar a           --->  Peso colombiano
                    6) Peso colombiano a --->  Dolar
                    7) Ver historial de conversiones
                    8) Salir
                    
                    Elija una opción válida.
                    
                    **********************************
                    """);

            opcionUsuario = Validator.leerOpcion(scanner);

            switch (opcionUsuario) {
                case 1:
                    Conversiones.convertir(scanner, "USD", "MXN", "USD", "pesos mexicanos");
                    break;
                case 2:
                    Conversiones.convertir(scanner, "MXN", "USD", "pesos mexicanos", "USD");
                    break;
                case 3:
                    Conversiones.convertir(scanner, "USD", "ARS", "USD", "pesos argentinos");
                    break;
                case 4:
                    Conversiones.convertir(scanner, "ARS", "USD", "pesos argentinos", "USD");
                    break;
                case 5:
                    Conversiones.convertir(scanner, "USD", "COP", "USD", "pesos colombianos");
                    break;
                case 6:
                    Conversiones.convertir(scanner, "COP", "USD", "pesos colombianos", "USD");
                    break;
                case 7:
                    Conversiones.mostrarHistorial();
                    break;
                case 8:
                    System.out.println("¡Hasta la próxima!");
                default:
                    System.out.println("Opción no válida. Intente nuevo número( 1 al 7)");
            }
        }
        scanner.close();
    }
}
