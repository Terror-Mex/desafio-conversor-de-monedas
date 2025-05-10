import java.util.Date;

public class Almacenar {

    private final String desde;
    private final String hacia;
    private final double monto;
    private final double resultado;
    private final Date fecha;

    public Almacenar(String desde, String hacia, double montoOriginal, double resultado) {
        this.desde = desde;
        this.hacia = hacia;
        this.monto = montoOriginal;
        this.resultado = resultado;
        this.fecha = new Date();
    }

    @Override
    public String toString() {
        return String.format("Fecha: %s | %.2f %s a %s = %.2f ", fecha, monto, desde, hacia, resultado);
    }
}
