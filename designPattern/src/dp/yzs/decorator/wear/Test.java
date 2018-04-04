package dp.yzs.decorator.wear;

import dp.yzs.decorator.wear.clothes.BigTrouser;
import dp.yzs.decorator.wear.clothes.Sneakers;
import dp.yzs.decorator.wear.clothes.TShirts;

public class Test {

	public static void main(String[] args) {
		Person xc = new Person("xiaocai");
		
		System.out.println("First Dress:");
		
		Sneakers sneakers = new Sneakers();
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();
		
		sneakers.Decorate(xc);
		bigTrouser.Decorate(sneakers);
		tShirts.Decorate(bigTrouser);
		tShirts.show();

	}

}
