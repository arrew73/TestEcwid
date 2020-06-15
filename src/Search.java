import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Search {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("F:/ip_addresses"));
        ArrayList<String> ip = new ArrayList<>();
        while (sc.hasNext()){
            ip.add(sc.nextLine());
            List<String> ip2 = ip.stream().distinct().collect(Collectors.toList());
            ip= (ArrayList<String>) ip2;
        }
        System.out.println(ip.size());
    }

}
