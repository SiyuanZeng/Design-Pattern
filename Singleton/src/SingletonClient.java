/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }

}
