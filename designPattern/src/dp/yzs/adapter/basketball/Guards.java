package dp.yzs.adapter.basketball;

/**
 * 后卫类
 */
public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Guards "+name+" attack");

	}

	@Override
	public void defense() {
		System.out.println("Guards "+name+" defense");

	}

}
