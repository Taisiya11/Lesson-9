import java.util.Collections;
import java.util.List;

/**
 * Класс кэширования сортировки.
 */
public class CacheSortList {
    private List cityCache;

    /**
     * Если данные уже были отсортированны, то вернется ранее сохраненный кэш сортировки, если нет, то данные отсортируются.
     * @param cityForSort данные для сортировки
     * @return отсортированные данные
     */
    public List parsesCacheData(List cityForSort) {
        if (cityCache==null) {
            Collections.sort(cityForSort);
            cityCache=cityForSort;
        }
        else {
            cityForSort = cityCache;
        }
        return cityForSort;
    }
}
