class PlaneWeight {
	public static void main(String[] args) {
		System.out.print("Your weight on Earth is ");
		double earthWeight = 205;
		System.out.println(earthWeight);
		
        System.out.print("Your weight on Mercury is ");
        double mercuryWeight = earthWeight * .378;
        System.out.println(mercuryWeight);

        System.out.print("Your weight on the Moon is ");
        double moonWeight = earthWeight * .166;
        System.out.println(moonWeight);

        System.out.print("Your weight on Jupiter is ");
        double jupiterWeight = earthWeight * 2.364;
        System.out.println(jupiterWeight);
	}
}