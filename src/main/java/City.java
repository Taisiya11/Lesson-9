import java.util.List;

/**
 * Класс сортировки городов по численности населения по их убыванию
 */
public class City implements Comparable<City> {
    private int i;
    private String city;

    City(int i, String city) {
        this.i = i;
        this.city = city;
    }
//    private static void cash(City city){
//        if (){}
//        else ;
//    }

    public int getI() {
        return i;
    }

    /**
     * Метод сортировки по убыванию по кол-ву жителей
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(City o) {
        if (i == o.getI()) {
            return 0;
        }
        return i > o.getI() ? -1 : 1;
    }

    /**
     * Метод вывода городов с численностью населения
     *
     * @return
     */
    @Override
    public String toString() {
        return "City=" + city + " " + "people=" + i;

    }
}
