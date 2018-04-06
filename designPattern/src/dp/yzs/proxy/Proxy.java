package dp.yzs.proxy;

/**
 *Proxy模式：为其他对象提供一种代理以控制对这个对象的访问 
 */
public class Proxy extends Subject {

	RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();

	}

}
