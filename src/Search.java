import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Search {
    public static int countUnique = 0;

    public static void main(String[] args) throws IOException {
        search();
        System.out.println(countUnique);
    }
    public static void search() throws IOException{
        while (true) {
            Files.lines(Paths.get("f:/ip_addresses"))
                    .distinct()
                .forEach(System.out::println);
            countUnique++;
        }
    }

}






