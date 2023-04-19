package enum1;

public enum movieseats {
	STANDARD(300),PREMIUM(400),RECLINER(550);
	int price;
	movieseats(int price) {
		this.price=price;
	}

}
