package transport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    EBike e=new EBike("EB-101",50); 
        e.deliver("Sandwich","Library"); 
         
        //Vehicle v=new Vehicle("V-1"); 
         
        Drone d=new Drone("DR-1"); 
        d.deliver("Notes","ExamHall"); 
         
        d.deliver("USB","CSE Blick"); 
         
        double bill=d.cost(5); 
        System.out.println("Drone delivery cost:Rs."+bill);

	}

}
