package cau_truc_ifelse;
import java.util.Scanner;
public class KiemTraSoChanLe {

	public static void main(String[] args) {
		int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        number = scanner.nextInt();
         
        // số chẵn là số chia hết cho 2
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn");
        } else {
            // ngược lại là số lẻ
            System.out.println(number + " là số lẻ");
        }
        scanner.close();
	}
}

