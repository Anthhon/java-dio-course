public class User{

	public static void checkTvStatus(SmartTV myTV){
		System.out.println("TV is on? " + myTV.tvIsOn);
		// Avoid impossible status change
		if(!myTV.tvIsOn) return;
		System.out.println("Actual channel: " + myTV.channel);
		System.out.println("Actual volume: " + myTV.volume);
	}

	public static void main(String[] args) throws Exception {
		// Create new TV object
		SmartTV myTV = new SmartTV();

		// Make some actions with TV object
		checkTvStatus(myTV);
		myTV.turnOn();
		checkTvStatus(myTV);
		myTV.increaseVolume();
		checkTvStatus(myTV);
		myTV.decreaseVolume();
		checkTvStatus(myTV);
	}
}

