package lab07;

public class ProducerConsumerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 MessageBoard board = new MessageBoard(); 
         Producer p = new Producer(board); 
         Consumer c = new Consumer(board); 
 
         p.start(); 
         c.start(); 
 
        p.join(); 
        c.join(); 
     } 
 }


