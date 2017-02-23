/**
 * Created by jb039k on 6/27/2016.
 */

class SingletonDemo{

    private SingletonDemo() {

    }
    public String str = "";

    public static SingletonDemo getSingletonInstance() {
        SingletonDemo instance = new SingletonDemo();
        return instance;
    }


}
