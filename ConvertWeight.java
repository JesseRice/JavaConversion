/*This class converts pounds and kilograms.
*@AUTHOR: Jesse Rice
*@DATE: 5-6-2014
*/

public class ConvertWeight{

	private double initialWeight;
	private double finalWeight;
	private int conversionType;
	
	public ConvertWeight(int type){
	
		conversionType = type;
	
	}
	
	public void calcWeight(double weight){
	
		initialWeight = weight;
		if(conversionType == 1/*pounds to kg*/){
		
			finalWeight = weight * .45359237;
		
		}else if(conversionType == 2/*kg to pounds*/){
		
			finalWeight = weight * 2.204585537;
		
		}
	
	}
	
	public double getWeight(){
	
		return finalWeight;
	
	}

}
