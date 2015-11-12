package proxy.dynamic_proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 产生一个真实对象的代理，其中InvocationHandler是jdk提供的动态代理接口，对被代理类的方法进行代理
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayIH implements InvocationHandler {

	// 被代理的实例
	Object obj = null;

	/**
	 * 我要代理谁
	 * @param obj
	 */
	public GamePlayIH(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.obj, args);
	}

}
