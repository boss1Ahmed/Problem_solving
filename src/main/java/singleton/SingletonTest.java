package singleton;

public class SingletonTest {
    private static SingletonTest test ;
    /*Eager loading*/
    //private static SingleonTest test = new SingletonTest();
    private int i;
    private SingletonTest(){}
    public static SingletonTest getInstance(){
        if (test==null){
            test= new SingletonTest();
            return test;
        }else {
            return test;
        }
    }
    public void incrementAndPrint(){
        i++;
        System.out.println("the value of i is = "+i);
    }

}
