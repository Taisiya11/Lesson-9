import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitySortTest {
    @Test
    public void sortingCityTest() {
        List city = new ArrayList();
        city.add(new City(4, "Москва"));
        city.add(new City(1, "Питер"));
        city.add(new City(8, "Тверь"));

        Collections.sort(city);
    }
}
