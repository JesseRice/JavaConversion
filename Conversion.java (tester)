/*This class converts temperature, weight, speed, and distance.
*@AUTHOR: Jesse Rice
*@DATE: 5-6-2014
*/

import java.util.Scanner;
public class Conversion{

	public static void main(String[] args){
	
		System.out.println("Please enter the number code for the conversion you would like to perform.");
		System.out.println("1) Weight");
		System.out.println("2) Distance");
		System.out.println("3) Speed");
		System.out.println("4) Temperature");
		
		Scanner input = new Scanner(System.in);
		int mainConversionType = input.nextInt();
		
		if (mainConversionType == 1){
		
			System.out.println("Please enter the number code for the type of conversion you'd like to perform.");
			System.out.println("1) LBS TO KG");
			System.out.println("2) KG TO LBS");
			int type = input.nextInt();
			System.out.println("Please enter the starting weight.");
			double weight = input.nextDouble();
			ConvertWeight finalWeight = new ConvertWeight(type);
			finalWeight.calcWeight(weight);
			System.out.println(finalWeight.getWeight());
		
		}else if (mainConversionType == 2){
		
			System.out.println("Please enter the number code for the type of conversion you'd like to perform.");
			System.out.println("1) IN TO CM");
			System.out.println("2) CM TO IN");
			int type = input.nextInt();
			System.out.println("Please enter the starting distance.");
			double distance = input.nextDouble();
			ConvertMeasurement measure = new ConvertMeasurement(type);
			measure.clacMeasure(distance);//need to fix type-o "clac"
			System.out.println(measure.getMeasure());
		
		}else if (mainConversionType == 3){
		
			System.out.println("Please enter the number code for the type of conversion you'd like to perform.");
			System.out.println("1) MPH TO KM/H");
			System.out.println("2) KM/H TO MPH");
			int type = input.nextInt();
			System.out.println("Please enter the starting speed.");
			double speedInput = input.nextDouble();
			ConvertSpeed speed = new ConvertSpeed(type);
			speed.calcSpeed(speedInput);
			System.out.println(speed.getSpeed());
		
		}else if (mainConversionType == 4){
		
			System.out.println("Please enter the number code for the type of conversion you'd like to perform.");
			System.out.println("1) F TO C");
			System.out.println("2) C TO F");
			int type = input.nextInt();
			System.out.println("Please enter the starting temperature.");
			double temp = input.nextDouble();
			ConvertTemp temperature = new ConvertTemp(type);
			temperature.calcTemp(temp);
			System.out.println(temperature.getTemp());
	
		}
		
	
		
		
	
	}

}
