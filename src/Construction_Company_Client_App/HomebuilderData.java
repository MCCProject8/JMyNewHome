package Construction_Company_Client_App;

import com.sun.accessibility.internal.resources.accessibility;

public class HomebuilderData {

	int modelPrice; 
	int bedroomPrice; 
	int garagePrice;
	int finalPrice;
	
	public int getmodelPrice(){
		
		return modelPrice;
	}
	public void setmodelPrice(int modelPrice){
		
		this.modelPrice = modelPrice;
	}
	public int getbedroomPrice(){
	
		return bedroomPrice;
	}	
	public void setbedroomPrice(int bedroomPrice){
	
		this.bedroomPrice = bedroomPrice;
	}
	public int getgaragePrice(){
		
		return garagePrice;
	}
	public void setgaragePrice(int garagePrice){
		
		this.garagePrice = garagePrice;
	}
	
	public int setFinalHomePrice(){
		
		finalPrice = modelPrice + garagePrice + bedroomPrice;
		
		return finalPrice;
		
	}
	
	public String finalMessage(){
		
		String modelPrice = String.valueOf(this.modelPrice);
		String bedroomPrice = String.valueOf(this.bedroomPrice);
		String garagePrice = String.valueOf(this.garagePrice);
		String finalPrice = String.valueOf(this.finalPrice);
		
		StringBuilder str = new StringBuilder();
		str.append("Your price quote is: ");
		str.append("Model Price: ");
		str.append(modelPrice);
		str.append("Bedroom Price: ");
		str.append(bedroomPrice);
		str.append("Garage Price: ");
		str.append(garagePrice);
		str.append("\n");
		str.append("Your total comes to: ");
		str.append(finalPrice);
		
		String quote = str.toString();

		return quote;
		
	}
	
	
}











