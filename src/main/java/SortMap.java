import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

/**
 * Класс сортировки структуры данных Map
 */

public class SortMap {
    /**
     * Метод сортировки Map по убыванию
     * @param map Принимает коллекцию map для сортировки
     * @return возращает отсортированную структуру данных
     */
    public HashMap<String, Integer> sortsInDescendingOrder(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet() //получить набор записей
                .stream()  //получить поток записей
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))  //сортировака записей по значениям
                .collect(  //собераем результат
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, //получаем результат на другом map
                                LinkedHashMap::new));
        return (HashMap<String, Integer>) sortedMap;
    }

    /**
     * Метод сортировки Map по возрастанию
     * @param map Принимает коллекцию map для сортировки
     * @return возращает отсортированную структуру данных
     */
    public HashMap<String, Integer> sortAscending(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));
        return (HashMap<String, Integer>) sortedMap;
    }

}

