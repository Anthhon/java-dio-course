public class SmartTV{
	// TV cames off by start
	boolean tvIsOn = false; 
	// Default channel and voume defined
	int channel = 1, volume = 50; 

	public void turnOn(){
		if(tvIsOn) return;
		System.out.println("__Turning TV on__");
		tvIsOn = true;
	}

	public void turnOff(){
		// Avoid impossible status change
		if(!tvIsOn) return;
		System.out.println("__Turning TV off__");
		tvIsOn = false;
	}

	public void increaseVolume(){
		// Avoid impossible status change
		if(!tvIsOn) return;
		++volume;
		System.out.println("__TV volume is now: " + volume);
	}

	public void decreaseVolume(){
		// Avoid impossible status change
		if(!tvIsOn) return;
		++volume;
		System.out.println("__TV volume is now: " + volume);
	}
}
