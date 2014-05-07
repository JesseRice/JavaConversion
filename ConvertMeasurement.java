/*This class converts inches and centimeters.
*@AUTHOR: Jesse Rice
*@DATE: 5-6-2014
*/

public class ConvertMeasurement{

	private double initialMeasure;
	private double finalMeasure;
	private int conversionType;
	
	public ConvertMeasurement(int type){
	
		conversionType = type;
	
	}
	
	public void clacMeasure(double measure){
	
		initialMeasure = measure;
		if (conversionType == 1/*inches to cm*/){
		
			finalMeasure = measure * 2.54;
		
		}else if(conversionType == 2/*cm to inches*/){
		
			finalMeasure = measure * .3937007874015748;
		
		}
		
	}
	
	public double getMeasure(){
	
		return finalMeasure;
	
	}

}
