package designpattern;

import com.ming.entity.MarryImpl;
import com.ming.interfaces.Marry;

public class TestCglibProxy {
    public static void main(String[] args) {
        Marry marry = new MarryImpl();
        CglibProxy cglibProxy = new CglibProxy();
        MarryImpl marryProxy = (MarryImpl)cglibProxy.getInstance(marry);
        marryProxy.marry();
    }
}
