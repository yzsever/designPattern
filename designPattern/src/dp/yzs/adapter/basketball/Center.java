package dp.yzs.adapter.basketball;

/**
 *中锋类 
 */
public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Center "+name+" attack");

	}

	@Override
	public void defense() {
		System.out.println("Center "+name+" defense");

	}

}
