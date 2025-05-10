import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {

    public static Double obtenerDatos(String from, String to, double mount) {
        String url = "https://v6.exchangerate-api.com/v6/b11a6780cf3c74bd9aa10c82/pair/" + from + "/" + to + "/" + mount;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            JsonObject root = gson.fromJson(json, JsonObject.class);
            return root.get("conversion_result").getAsDouble();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error en la solicitud");
            e.printStackTrace();
            return null;
        }
    }

}

