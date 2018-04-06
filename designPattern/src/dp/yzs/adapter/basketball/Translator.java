package dp.yzs.adapter.basketball;

public class Translator extends Player {

	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}

	@Override
	public void attack() {
		wjzf.attackChinese();

	}

	@Override
	public void defense() {
		wjzf.defenseChinese();
	}

}
