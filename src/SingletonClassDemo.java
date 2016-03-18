/**
 * Created by a on 18/3/16.
 */
public class SingletonClassDemo {
    public static void main(String[] args) {
        SingletonClass a = new SingletonClass();
        a.getInstance();
        a.getInstance();
        a.Outside();
        a.Outside();

    }
}
