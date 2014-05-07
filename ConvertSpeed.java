/*This class converts mph and km/h.
*@AUTHOR: Jesse Rice
*@DATE: 5-6-2014
*/

public class ConvertSpeed{

	private double initialSpeed;
	private double finalSpeed;
	private int conversionType;
	
	public ConvertSpeed(int type){
	
		conversionType = type;
	
	}
	
	public void calcSpeed(double speed){
	
		initialSpeed = speed;
		if (conversionType == 1/*mph to km/h*/){
		
			finalSpeed = speed * 1.609344;
		
		}else if (conversionType == 2/*km/h to mph*/){
		
			finalSpeed = speed * .621371192237334;
		
		}
	
	}
	
	public double getSpeed(){
	
		return finalSpeed;
	
	}

}
