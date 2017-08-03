/**
 * Created by JaMachine on 8/1/2017.
 */
public class Container <T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
