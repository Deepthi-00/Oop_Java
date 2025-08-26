package program2;

public class Car {
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownerName;
	
	private static int totalCars;
	private static String showRoomName="autoshow";
	
	public Car(String b,String m,double p,double mil) {
		this.brand=b;
		this.model=m;
		this.price=p;
		this.mileage=mil;
		ownerName="not assigned";
		totalCars++;
	}
	public Car(String b,String m,double p,double mil,String owner) {
		this.brand=b;
		this.model=m;
		this.price=p;
		this.mileage=mil;
		this.ownerName=owner;
		totalCars++;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void displayDetails() {
		System.out.println("Brand:" +brand);
		System.out.println("Model:" +model);
		System.out.println("Price:" +price);
		System.out.println("Mileage:" +mileage);
		System.out.println("Ownername:" +ownerName);
		System.out.println("-------------");
	}
	public void updatePrice(double newPrice) {
		price=newPrice;
	}
	public static void showTotalCars() {
		System.out.println("Total Cars:" +totalCars);
	}
	public static void showshowRoom() {
		System.out.println("Showroom name:" +showRoomName);
	}
}
		

	
