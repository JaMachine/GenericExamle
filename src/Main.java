import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Container<Product> c = new Container<>();
        c.setItem(new Camera());
        c.setItem(new Phone());

        Product p = c.getItem();





    }
    public void copy (List <? extends Product> src, List <? super Product> dest){
        for (Product p : src)
            dest.add(p);
    }

}
