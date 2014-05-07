/*This class converts Fahrenheit and Celsius.
*@AUTHOR: Jesse Rice
*@DATE: 5-6-2014
*/

public class ConvertTemp{

	private double initialTemp;
	private double finalTemp;
	private int conversionType;
	
	public ConvertTemp(int type){
	
		conversionType = type;
	
	}
	
	public void calcTemp(double temp){
	
		initialTemp = temp;
		if(conversionType == 1/*Fahrenheit to Celsius*/){
		
			finalTemp = (temp -32) * 0.5555555555555556;
		
		}else if(conversionType == 2/*Celsius to Fahrenheit*/){
		
			finalTemp = (temp * 1.8) + 32;
		
		}
	
	}
	
	public double getTemp(){
	
		return finalTemp;
	
	}

}
