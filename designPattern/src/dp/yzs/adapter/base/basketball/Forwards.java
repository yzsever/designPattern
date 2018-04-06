package dp.yzs.adapter.base.basketball;

/**
 *前锋类
 */
public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Forwards "+name+" attack");

	}

	@Override
	public void defense() {
		System.out.println("Forwards "+name+" defense");

	}

}
