package dp.yzs.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("Real subject!");

	}

}
