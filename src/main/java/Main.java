import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ReadsFromFile readsFromFile = new ReadsFromFile();
        readsFromFile.readsFromFile("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt");
        System.out.println(readsFromFile.city);
        Collections.sort(readsFromFile.city);
        System.out.println(readsFromFile.city);
    }
}
