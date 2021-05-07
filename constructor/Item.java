package ecftech.constructor;

public class Item {

	// 名前
	String name;
	// 値段
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void display () {
		System.out.println(name + ":" + price + "円");
	}

}
