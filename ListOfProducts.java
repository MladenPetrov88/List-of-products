import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<String> product = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            product.add(scanner.nextLine());

        }

        for (int i = 0; i < product.size(); i++) {
            Collections.sort(product);
            System.out.printf("%d.%s%n",i + 1,product.get(i));
        }
    }
}
