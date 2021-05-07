package ecftech.constructor;

public class Shop {

	//フィールド
	String name;
	int sales;

	//コンストラクタ１
	public Shop (String name, int sales) {
		this.name = name;
		this.sales = sales;
	}

	//コンストラクタ２
	public Shop () {
		this("出店予定",0);
	}

	//disaplayメソッド
	public void display() {
		System.out.println(this.name + ":売上高" + this.sales + "円");
	}

}
