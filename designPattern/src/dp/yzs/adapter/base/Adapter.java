package dp.yzs.adapter.base;

/**
 *适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 *Adapter模式使得原来由于接口不兼容而不能一起工作得那些类 可以一起工作。
 *大话设计模式：172页
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.SpecificRequest();
	}

}
