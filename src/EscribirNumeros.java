import java.io.FileWriter;
import java.io.IOException;

public class EscribirNumeros {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("numeros.txt");

            for (int i = 1; i <= 10; i++) {
                writer.write(i + "\n"); // Escribimos cada número en una línea
            }

            writer.close();
            System.out.println("Números del 1 al 10 guardados en numeros.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
