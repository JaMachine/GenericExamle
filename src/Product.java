/**
 * 
 */
public class Product implements Comparable<Product>{
    String name;
    Double price;

    public int compareTo(Product o) {
        if (this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;

    }
}
