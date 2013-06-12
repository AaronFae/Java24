class Commodity {
	public static void main(String[] args){
		int balance = 550;
		int quantity = 42;
		String command = "BUY";
		switch (command) {
			case "BUY" :
				quantity += 5;
				balance -= 20;
				break;
			case "SELL":
				quantity -=5;
				balance +=15;
				break;
		}
		System.out.println("Balance: " + balance + "\n"
				+ "Quantity: " + quantity);
	}
}
