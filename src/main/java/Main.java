import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ReadsFromFile readsFromFile = new ReadsFromFile();
        readsFromFile.readsFromFile("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt");
        CacheSortList cacheSortList = new CacheSortList();
        System.out.println(cacheSortList.parsesCacheData(readsFromFile.city));
        System.out.println(cacheSortList.parsesCacheData(readsFromFile.city));



//        System.out.println(readsFromFile.city);
//        Collections.sort(readsFromFile.city);
//        System.out.println(readsFromFile.city);
    }
}
