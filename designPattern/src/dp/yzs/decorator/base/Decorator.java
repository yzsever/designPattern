package dp.yzs.decorator.base;

/**
 * Decorator,装饰抽象类，继承了Component，从外类扩展Component类的功能，
 * 但对于Component来说，是无需知道Decorator的存在的
 */
public abstract class Decorator extends Component {

	protected Component component;
	
	public void SetComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void Operation() {
		// TODO Auto-generated method stub

	}

}
