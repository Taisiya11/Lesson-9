import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс чтения из файла данных и преобразования в структуру List
 */
public class ReadsFromFile {
    String[] data;
    List city = new ArrayList();

    /**
     * Метод чтения из файла данных и преобразования в структуру List
     *
     * @param file файл для чтения данных
     * @return преобразованные данные из файла в структуру данных List
     */
    public List readsFromFile(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                data = line.split("=");
                city.add(new City(Integer.parseInt(data[1]), data[0]));
                line = reader.readLine();
            }
        } catch (IOException e) {
        }
        return city;
    }
}
