package ecftech.constructor;

public class Item {

	String name;
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void display () {
		System.out.println(name + ":" + price + "円");
	}

}
