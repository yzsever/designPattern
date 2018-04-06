package dp.yzs.adapter.basketball;

public class Test {

	public static void main(String[] args) {
		Player b = new Forwards("Badier");
		b.attack();
		
		Player m = new Guards("Micgelady");
		m.attack();
		
		Player ym = new Translator("yaoming");
		ym.attack();
		ym.defense();
		

	}

}
