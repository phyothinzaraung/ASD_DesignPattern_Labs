package bank.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimmingProxy implements InvocationHandler {
    public Object target;

    public TimmingProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Timming timming = new Timming();
        timming.start();

        Object returnValue = method.invoke(target, args);
        timming.end();

        System.out.println("The method " + method.getName() + " took " + timming.timeDiff() + "ms");
        return returnValue;
    }
}
