class SpaceRemover {
	public static void main(String[] args) {
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++) {
			char current =mfl[dex];
			if (current == ' ') {
				System.out.print(".");
			} else {
				System.out.print(current);
			}
		}
		System.out.println();
	}
}
