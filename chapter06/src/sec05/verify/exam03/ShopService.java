package sec05.verify.exam03;

public class ShopService {
	private static ShopService Singleton = new ShopService();
	
	private ShopService() { }
	
	static ShopService getInstance() {
		return Singleton;
	}
}