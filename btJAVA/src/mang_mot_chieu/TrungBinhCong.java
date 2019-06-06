package mang_mot_chieu;

import java.util.Scanner;

class TrungBinhCong {

	public static void main(String[] args) {
		int n; int sum = 0, number;
		 float avgNumber;
		 Scanner scanner = new Scanner(System.in);
		
		 do {
		        System.out.println("Nhập vào số phần tử của mảng: ");
		        n = scanner.nextInt();
		    } while (n <= 0);
		         
		    int A[] = new int[n];    
	         
	        
		    for (int count = 1; count <=n; count++) {
	            System.out.println("Nhập phần tử thứ  " + count + ": ");
	            number = scanner.nextInt();
	            sum += number;
	        	}
	         
	        avgNumber = (float) sum / n;
	        System.out.println("Trung bình cộng = " + (avgNumber));
		  
		    
		    scanner.close();

	}

}
