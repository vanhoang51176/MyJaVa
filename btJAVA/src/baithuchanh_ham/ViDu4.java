package baithuchanh_ham;
import java.util.*;
class ViDu4 {
	public static void getRandomNumber()
	{
		Random rd = new Random(); 
	    int number = rd.nextInt(); 
	    System.out.println("So vua duoc sinh ra la " + number);
	         
	    int number1 = rd.nextInt(4); 
	    System.out.println("So vua duoc sinh ra la " + number1);
	    int number2 = -4 + rd.nextInt(4);   
	    System.out.println("So vua duoc sinh ra la " + number2);
	}				
	public static void main(String[] args) {
		getRandomNumber();
	}
}


