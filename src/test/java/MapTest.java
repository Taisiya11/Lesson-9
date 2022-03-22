import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class MapTest {
    @Test
    public void MatTests() {
        SortMap sortMap = new SortMap();
        Map<String, Integer> city = new HashMap<>();
        Map<String, Integer> city2 = new HashMap<>();
        city.put("Москва", 5);
        city.put("Киев", 7);
        city.put("Питер", 3);
        city.put("Тверь", 1);

        city2.put("Москва", 5);
        city2.put("Киев", 7);
        city2.put("Питер", 3);
        city2.put("Тверь", 1);
        System.out.println(city);

        Assert.assertEquals(city.get("Москва"), 5, 0);
        Assert.assertEquals(city.get("Тверь"), 1, 0);
        Assert.assertEquals(city.size(), 4, 0);

        System.out.println(sortMap.sortsInDescendingOrder(city));
        System.out.println(sortMap.sortAscending(city));
    }

}
