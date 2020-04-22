import java.util.Scanner;

public class menu {
	
	//Papa Pizza Java Application

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//Creating object for the pizza class
		pizza pzN1 = new pizza();
		pizza pzN2 = new pizza();
		pizza pzN3 = new pizza();
		pizza pzN4 = new pizza();
		pizza pzN5 = new pizza();
		pizza pzN6 = new pizza();
		pizza pzN7 = new pizza();
		pizza pzN8 = new pizza();
		pizza pzN9 = new pizza();
		pizza pzN10 = new pizza();
		pizza pzN11 = new pizza();
		pizza pzN12 = new pizza();
		pizza pzN13 = new pizza();
		pizza pzN14 = new pizza();
		pizza pzN15 = new pizza();
		
		//Assigning the names of Pizza
		pzN1.setPizzaName("Big Papa's Pizza");
		pzN2.setPizzaName("Pepperoni passion Pizza");
		pzN3.setPizzaName("Meat Eater pizza");
		pzN4.setPizzaName("Magherita pizza");
		pzN5.setPizzaName("Papa's Favourite Pizza");
		pzN6.setPizzaName("Chicken Delight Pizza");
		pzN7.setPizzaName("Papa's Full House");
		pzN8.setPizzaName("Full BBQ Pizza");
		
		//Assigning the sizes of the Pizza
		pzN1.setPizzaSize("Medium and Large");
		pzN2.setPizzaSize("Large Size");
		pzN3.setPizzaSize("Medium");
		pzN4.setPizzaSize("King");
		pzN5.setPizzaSize("Medium");
		pzN6.setPizzaName("Family");
		pzN7.setPizzaSize("Medium");
		pzN7.setPizzaName("Small");
		pzN8.setPizzaSize("Medium");
		
		//Assigning Prices of pizza
		pzN1.setPrice("Gh45");
		pzN2.setPrice("Gh55");
		pzN3.setPrice("Gh60");
		pzN4.setPrice("Gh65");
		pzN5.setPrice("Gh45");
		pzN6.setPrice("Gh50");
		pzN7.setPrice("Gh30");
		pzN8.setPrice("Gh62");
		
		
		//Assigning Delivery Time
		pzN1.setDeliveryTime("20mins");
		pzN2.setDeliveryTime("20mins");
		pzN3.setDeliveryTime("20mins");
		pzN4.setDeliveryTime("20mins");
		pzN5.setDeliveryTime("20mins");
		pzN6.setDeliveryTime("20mins");
		pzN7.setDeliveryTime("20mins");
		pzN8.setDeliveryTime("20mins");
		
		
		//Creating menu for the desert class
		desert ds1 = new desert();
		desert ds2 = new desert();
		desert ds3 = new desert();
		desert ds4 = new desert();
		desert ds5 = new desert();
		
		//Assigning desert names
		ds1.setDesertName("Vanilla Ice Cream");
		ds2.setDesertName("Pop Corn");
		ds3.setDesertName("Cocoa Chocolate");
		ds4.setDesertName("Toffee & HoneyComb Ice Cream");
		ds5.setDesertName("Salted Caramel Mouses");
		
		//Assigning Desert price
		ds1.setDesertPrice("Ghc20");
		ds2.setDesertPrice("Ghc15");
		ds3.setDesertPrice("Ghc25");
		ds4.setDesertPrice("Ghc20");
		ds5.setDesertPrice("Ghc15");
		
		
		//Print Out to customer :)
		
		System.out.println("<<===================>>");
		System.out.println("HELLO AND WELCOME TO PAPA's PIZZA WORLD");
		System.out.println("Kindly look through our menu and choose what you want to order");
		System.out.println("1. Pizza");
		System.out.println("2. Desert");
		int choice;
		System.out.println("Please Enter your choice: ");
		
		choice = s.nextInt();
		if(choice == 1) {
			System.out.println("We have Nine Types of Pizzas Available. These are:");
			System.out.println("1. Big Papa's Pizza ");
			System.out.println("2. Pepperoni passion Pizza");
			System.out.println("3. Meat Eater pizza");
			System.out.println("4. Magherita pizza");
			System.out.println("5. Papa's Favourite Pizza");
			System.out.println("6. Chicken Delight Pizza");
			System.out.println("7. Papa's Full House");
			System.out.println("8. Full BBQ Pizza");
			System.out.println();
			System.out.println("Please Select the pizza type you want: ");
			int pizzaChoice;
			pizzaChoice = s.nextInt();
			if(pizzaChoice == 1) {
				System.out.println("The Big Papa's Pizza cost "+ pzN1.getPrice()+"."+"It will be ready in"
									+ pzN1.getDeliveryTime());
			}else if(pizzaChoice ==2) {
				System.out.println("The Pepperoni passion Pizza "+ pzN2.getPrice()+"."+"It will be ready in"
						+ pzN2.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 3) {
				System.out.println("The Meat Eater pizza "+ pzN3.getPrice()+"."+"It will be ready in"
						+ pzN3.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 4) {
				System.out.println("The Magherita pizza "+ pzN4.getPrice()+"."+"It will be ready in"
						+ pzN4.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 5) {
				System.out.println("The Papa's Favourite pizza "+ pzN4.getPrice()+"."+"It will be ready in"
						+ pzN4.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 6) {
				System.out.println("The Chicken Delight pizza "+ pzN5.getPrice()+"."+"It will be ready in"
						+ pzN5.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 7) {
				System.out.println("The Papa's Full House pizza "+ pzN6.getPrice()+"."+"It will be ready in"
						+ pzN6.getDeliveryTime() + "Thank you for your order!");
			}else if(pizzaChoice == 8) {
				System.out.println("The Full BBQ Pizza "+ pzN7.getPrice()+"."+"It will be ready in"
						+ pzN7.getDeliveryTime() + "Thank you for your order!");
			}else {
				System.out.println("Please Enter a Number between 1 and 8. Thank you.");
			}
			
		}
		else if(choice == 2) {
			System.out.println("We have five types of deserts available for your selection");
			System.out.println("These are: ");
			System.out.println("1. Vanilla Ice Cream");
			System.out.println("2. Pop Corn");
			System.out.println("3. Cocoa Chocolate");
			System.out.println("4. Toffee & HoneyComb Ice Cream");
			System.out.println("5. Salted Caramel Mouses");
			System.out.println();
			System.out.println("Please choose the desert type you want: ");
			int desertType;
			desertType = s.nextInt();
			if(desertType == 1) {
				System.out.println(ds1.getDesertName()+" Cost: " +ds1.getDesertPrice());
			}else if(desertType == 2) {
				System.out.println(ds2.getDesertName()+" Cost: " +ds2.getDesertPrice());
			}else if(desertType == 3) {
				System.out.println(ds3.getDesertName()+" Cost: " +ds3.getDesertPrice());
			}else if(desertType == 4) {
				System.out.println(ds4.getDesertName()+" Cost: " +ds4.getDesertPrice());
			}else if(desertType == 5) {
				System.out.println(ds5.getDesertName()+" Cost: " +ds5.getDesertPrice());
			}else {
				System.out.println("Please Enter the Right number between 1 - 5");
			}
		}
		else {
			System.out.println("Please Enter Choices 1 or 2");
		}
	}

}
