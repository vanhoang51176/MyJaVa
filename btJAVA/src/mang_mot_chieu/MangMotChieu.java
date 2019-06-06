package mang_mot_chieu;
import java.text.DecimalFormat;
import java.util.Scanner;
class MangMotChieu {

	public static void main(String[] args) {
		 int n; int sum = 0, number;
		 float avgNumber;
		 Scanner scanner = new Scanner(System.in);
		
		    
		    DecimalFormat decimalFormat = new DecimalFormat("#.##");    
	         
	        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
	        n = scanner.nextInt();
		    for (int count = 1; count <=n; count++) {
	            System.out.println("Nhập số thứ " + count + ": ");
	            number = scanner.nextInt();
	            sum += number;
	        	}
	         
	        avgNumber = (float) sum / n;
	        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
		  
		    
		    scanner.close();
	}

}
