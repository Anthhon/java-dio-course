public class App
{
	public static void main(String[] args){
		String firName = "Anthony";
		String secName = "Silva";
		String completeName = addNames(firName, secName);

		System.out.println(completeName);
	}

	public static String addNames(String firName, String secName){
		return "Complete name: " + firName + " " + secName;
	}
}
