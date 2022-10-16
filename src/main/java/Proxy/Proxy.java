package Proxy;

public class Proxy extends RealSubject{
    @Override
    public void show() {
        System.out.println("call via proxy: ");
        super.show();
    }
}
