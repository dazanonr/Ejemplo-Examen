import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String nombre, autor, estado, DNI;
        LocalDate fechaSolicitud, fechaEntrega;

        ArrayList<LibroBiblioteca> bibliotecaList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(
                        "C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra\\Ejemplo-Examen\\Biblioteca Nacional de España.txt"))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                    nombre = bufferedReader.readLine();
                    bufferedReader.readLine();
                    autor = bufferedReader.readLine();
                    bufferedReader.readLine();
                    fechaSolicitud = LocalDate.parse(bufferedReader.readLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    bufferedReader.readLine();
                    fechaEntrega = LocalDate.parse(bufferedReader.readLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    bufferedReader.readLine();
                    estado = bufferedReader.readLine();
                    bufferedReader.readLine();
                    DNI = bufferedReader.readLine();

                    bibliotecaList.add(new LibroBiblioteca(nombre, autor, estado, DNI, fechaSolicitud, fechaEntrega));
            }
            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(
                            "C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra\\Ejemplo-Examen\\inventario_y_vencimientos_fechaHoy.txt"));

            Iterator<LibroBiblioteca> iterator = bibliotecaList.iterator();
            while (iterator.hasNext()) {
                LibroBiblioteca libro = iterator.next();
                bufferedWriter.write(libro.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}