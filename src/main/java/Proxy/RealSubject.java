package Proxy;

public class RealSubject implements Subject{

    @Override
    public void show() {

        System.out.println("Good!");
    }
    public void show1(){
        System.out.println("not Good?!");
    }
}
