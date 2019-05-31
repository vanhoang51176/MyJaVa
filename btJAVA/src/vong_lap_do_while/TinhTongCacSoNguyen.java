package vong_lap_do_while;
import java.util.Scanner;
class TinhTongCacSoNguyen {

	public static void main(String[] args) {
		int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        // bắt đầu vòng lặp
        // điều kiện sum < 100 chỉ được thực hiện sau khi thân vòng lặp đã được thực hiện.
        do {
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            number = scanner.nextInt();
            sum += number;  // sum = sum + number;
        } while (sum < 100); 
         
        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
        scanner.close();
	}

}
