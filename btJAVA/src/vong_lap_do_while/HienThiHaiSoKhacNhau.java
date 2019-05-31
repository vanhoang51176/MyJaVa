/*package vong_lap_do_while;
import java.util.Scanner;
class HienThiHaiSoKhacNhau {

	public static void main(String[] args) {
		int number1, number2;
        Scanner scanner = new Scanner(System.in);
         
        /*
         * Khởi tạo biến number1 = 0 và number2 = number1 + 3.
         * Nếu number2 còn nhỏ hơn 8 thì hiển thị biến number1 và number2
         * Tăng biến number1 và number2 lên 1 và tiếp tục kiểm tra.
        
        for (number1 = 0, number2 = number1 + 3; number2 < 8; number1++, number2++) {
            System.out.println(number1 + ", " + number2);
        }
        scanner.close();

	}
}
*/
/*Vòng lặp for lồng nhau
 * 
 */
package vong_lap_do_while;
import java.util.Scanner;
class HienThiHaiSoKhacNhau {
	public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
         
        // Vòng lặp for bên ngoài thực thi 3 lần với row = 1, 2, 3.
        for (number1 = 1; number1 <= 3; number1++) {
            // Mỗi lần lặp for bên ngoài 
            // thì vòng lặp for trong sẽ thực thi 2 lần với col = 1, 2.
            for (number2 = 1; number2 <= 2; number2++) {
                System.out.println("number1 = " + number1 + ", number2 = " + number2);
            }
        }scanner.close();
	}
}
    

