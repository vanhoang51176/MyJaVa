package cau_truc_ifelse;
import java.util.Scanner;
class TimSoLonNhatTrong3So {

	public static void main(String[] args) {
		int firstNumber, secondNumber, thirdNumber, largestNumber;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        thirdNumber = scanner.nextInt();
         
        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                largestNumber = firstNumber;
            } else {
                largestNumber = thirdNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }
         
        System.out.println("Số lớn nhất trong 3 số " + firstNumber + ", " + secondNumber + 
                        " và " + thirdNumber + " là " + largestNumber);
        scanner.close();
	}

}
