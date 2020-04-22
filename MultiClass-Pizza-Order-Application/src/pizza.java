
public class pizza {
	//creating an instance variable for pizza
	private String pizzaName;
	private String pizzaSize;
	private String pizzaPrice;
	private String deliveryTime;
	
	//constructors
	/* public pizza(String pizzaName, String pizzaSize, String pizzaPrice, String deliveryTime) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
		this.pizzaSize = pizzaPrice;
		this.deliveryTime = deliveryTime;
	}
	*/
	
	
	
	//getters 
	public String getPizzaName() {
		return pizzaName;
	}
	
	public String getPizzaSize() {
		return pizzaSize;
	}
	
	public String getPrice() {
		return pizzaPrice;
	}
	
	public String getDeliveryTime() {
		return deliveryTime;
	}
	
	
	
	//setters
	public void setPizzaName(String PizzaName) {
		this.pizzaName = PizzaName;
	}
	
	public void setPizzaSize(String PizzaSize) {
		this.pizzaSize = PizzaSize;
	} 
	
	public void setPrice(String price) {
		this.pizzaPrice = price;
	}
	
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

}

