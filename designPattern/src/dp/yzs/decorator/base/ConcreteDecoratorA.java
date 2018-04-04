package dp.yzs.decorator.base;

/*
 * 具体的装饰对象，起到给Component添加职责的功能
 * */
public class ConcreteDecoratorA extends Decorator {
	
	@SuppressWarnings("unused")
	private String addedState;
	
	@Override
	public void Operation() {
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作！");
	}
}
