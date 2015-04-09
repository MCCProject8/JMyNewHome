package Construction_Company_Client_App;

import java.text.DecimalFormat;

public class HomebuilderData {

	int modelPrice; 
	int bedroomPrice; 
	int garagePrice;
	int finalPrice;
	public String defaultMessage = ("Enjoy Building Your New Home!\n"
			+ " - Aspen = $100,000\n - Brittany = $120,000\n - Colonial = $180,000\n - Dartmoor = $250,000"
			+ "\n - 1 bedroom = $10,500\n - 1 garage = $7,775");
	String modelType;
	
	public void setModelType(String modelT){
	
		modelType = modelT;
	}
	
	public String getModelType(){
		
		return modelType;
	}
		
	public void setmodelPrice(String modelPrice){
		
		
		if(modelPrice == "Aspen")
		{
			setModelType("Aspen");
			this.modelPrice = 100000;
		}
		else if(modelPrice == "Brittany")
		{
			setModelType("Brittany");
			this.modelPrice = 120000;
		}
		else if(modelPrice == "Colonial")
		{
			setModelType("Colonial");
			this.modelPrice = 180000;

		}
		else if(modelPrice == "Dartmoor")
		{
			setModelType("Dartmoor");
			this.modelPrice = 250000;

		}

	}
	
	public void setbedroomPrice(int bedroomAmount){
	
		if(bedroomAmount == 1)
		{
			bedroomPrice = 10500;
		}
		else if(bedroomAmount == 2)
		{
			bedroomPrice = 10500 * 2;

		}
		else if(bedroomAmount == 3)
		{
			bedroomPrice = 10500 * 3;

		}
		else if(bedroomAmount == 4)
		{
			bedroomPrice = 10500 * 4;

		}
		
	}
	
	public void setgaragePrice(int garageAmount){
		
		if(garageAmount == 0)
		{
			garagePrice = 0;

		}
		else if(garageAmount == 1)
		{
			garagePrice = 7775;
		}
		else if(garageAmount == 2)
		{
			garagePrice = 7775 * 2;

		}
		else if(garageAmount == 3)
		{
			garagePrice = 7775 * 3;

		}
	}
	
	public int setFinalHomePrice(){
		
		finalPrice = modelPrice + garagePrice + bedroomPrice;
		
		return finalPrice;
		
	}
	
	public String finalMessage(){
		
		DecimalFormat df = new DecimalFormat("$#,###,###,###.00");
		setFinalHomePrice();
		
		String modelPrice = String.valueOf(df.format(this.modelPrice));
		String bedroomPrice = String.valueOf(df.format(this.bedroomPrice));
		String garagePrice = String.valueOf(df.format(this.garagePrice));
		String finalPrice = String.valueOf(df.format(this.finalPrice));
		
		StringBuilder str = new StringBuilder();
		str.append("Your price quote is:\n");
		str.append(" - Model Price: ");
		str.append(modelPrice);
		str.append("\n - Bedroom Price: ");
		str.append(bedroomPrice);
		str.append("\n - Garage Price: ");
		str.append(garagePrice);
		str.append("\n");
		str.append("Your total comes to: ");
		str.append(finalPrice);
		
		String quote = str.toString();

		return quote;
		
	}
	
	
}











