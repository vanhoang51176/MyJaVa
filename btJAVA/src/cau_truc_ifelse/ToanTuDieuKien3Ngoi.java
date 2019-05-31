package cau_truc_ifelse;
import java.util.Scanner;
class ToanTuDieuKien3Ngoi {

	public static void main(String[] args) {
		int number;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số cần kiểm tra: ");
        number = scanner.nextInt();
         
        /*
         * Sử dụng toán tử điều kiện 3 ngôi
         */
        String ketQua = (number % 2 == 0) ? "Số " + number + " là số chẵn" : "Số " + number + 
            " là số lẻ";
        System.out.println(ketQua);

	}

}
