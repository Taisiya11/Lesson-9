import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс чтения из файла данных и преобразования в структуру Map
 */
public class ReadsFromFile {
    String[] data;
    Map<String, Integer> city = new HashMap<>();

    /**
     * Метод чтения из файла данных и преобразования в структуру Map
     * @param file файл для чтения данных
     * @return преобразованные данные из файла в структуру данных Map
     */
    public Map<String, Integer> readsFromFile(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                data = line.split("=");
                data = (String[]) ArrayCreation.add(data, line);
                String key = data[0];
                Integer value = Integer.valueOf(data[1]);
                city.put(key, value);
                line = reader.readLine();
            }
        } catch (IOException e) {
        }
        return city;
    }
}
