/**
 * Created by SiyuanZeng's on 6/10/2014.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance==null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a statically initialized Singleton!";
    }
}
