import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montoUsuario;
        int opcionUsuario = 0;

    while( opcionUsuario != 7) {

        System.out.println(""" 
                *********************************
                
                Bienvenido(a) al convertidor de monedas
                
                1) Dolar a           ---> Peso mexicano
                2) Peso mexicano a   ---> Dolar
                3) Dolar a           ---> Peso argentino
                4) Peso argentino a  ---> Dolar
                5) Dolar a           ---> Peso colombiano
                6) Peso colombiano a ---> Dolar
                7) Salir
                
                Elija una opción válida.
                **********************************
                """);

        if (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, escriba un número del 1 al 7.");
            scanner.next();
            continue;
        }
         opcionUsuario = scanner.nextInt();

        switch (opcionUsuario) {
            case 1:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("Usd", "MXN", montoUsuario));
                break;
            case 2:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("MXN", "USD", montoUsuario));
                break;
            case 3:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("USD", "ARS", montoUsuario));
                break;
            case 4:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("ARS", "USD", montoUsuario));
                break;
            case 5:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("USD", "COP", montoUsuario));
                break;
            case 6:
                System.out.println("Escribe el monto para convertir");
                montoUsuario = Validator.leerMonto(scanner);
                System.out.println(ConexionApi.obtenerDatos("COP", "USD", montoUsuario));
                break;
            case 7:
                System.out.println("Hasta la próxima!");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevo número( 1 al 7)");
        }
    }
        scanner.close();
    }
}
