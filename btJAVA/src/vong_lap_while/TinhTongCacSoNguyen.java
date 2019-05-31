package vong_lap_while;
import java.util.Scanner;
class TinhTongCacSoNguyen {

	public static void main(String[] args) {
		int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        // bắt đầu vòng lặp
        // kiểm tra nếu biến sum còn nhỏ hơn 100 thì còn thực hiện.
        while (sum < 100) {
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            number = scanner.nextInt();
            sum += number;  // sum = sum + number;
        }
         
        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
        scanner.close();
	}

}
