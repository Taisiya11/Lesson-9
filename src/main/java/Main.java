import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ReadsFromFile readsFromFile = new ReadsFromFile();
        readsFromFile.readsFromFile("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt");
        System.out.println(readsFromFile.city);
        SortMap sortMap = new SortMap();
        System.out.println(sortMap.sortsInDescendingOrder(readsFromFile.city));
        System.out.println(sortMap.sortAscending(readsFromFile.city));
    }
}
