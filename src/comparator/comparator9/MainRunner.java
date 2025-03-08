package comparator.comparator9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("vivo",20000));
        list.add(new Product("moto",80000));
        list.add(new Product("apple",80000));
        list.add(new Product("samsung",70000));
        list.add(new Product("nokia",30000));
        list.add(new Product("lava",50000));

        List<Product> newlist = list.stream().sorted(Comparator.comparing(Product::getPrice)
                .thenComparing(Product::getProductName).reversed()).toList();

        System.out.println(newlist);
    }
}
