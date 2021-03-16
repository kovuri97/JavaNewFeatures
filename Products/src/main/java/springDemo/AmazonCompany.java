package springDemo;

import java.util.Random;

public class AmazonCompany {
	private Cart cart;

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public String ItemNumber(String str) {
		Random r = new Random();
		int item1 = r.nextInt(1000);
		String msg = cart.item(item1);
		return "product name: "+str+" "+msg;
	}
}
