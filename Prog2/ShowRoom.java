package program2;

public class ShowRoom {

	public static void main(String[] args) {
		Car c1=new Car("Toyoto","Corolla",16000,18.5);
		Car c2=new Car("Honda","Civic",20000,16.5);
//		Car c3=new Car("Hyundai","i04",30000,13.5);
		
		c1.displayDetails();
		c2.displayDetails();
		c2.displayDetails();
		
		c1.setOwnerName("joo");
		c1.updatePrice(17000);
		
		System.out.println("After updates:");
		c1.displayDetails();
		
		Car.showshowRoom();
		Car.showTotalCars();
		

	}

}
