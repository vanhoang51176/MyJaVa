package mang_mot_chieu;
import java.util.Scanner;
class Mang1Chieu {

	public static void main(String[] args) {
	/*
		//Truy xuất các phần tử của mảng
		
		// Khai báo và khởi tạo giá trị ban đầu cho mảng
	    char[] kyTu = new char[] {'a', 'b', 'c', 'd', 'e'};
	         
	    // hiển thị ký tự tại vị trí thứ 2 trong mảng
	    System.out.println("Ký tự tại vị trí thứ 2 trong mảng là " + kyTu[2]);
	*/
	/*	
		//Nhập xuất các phần tử cho mảng
		int size;   // kích thước của mảng
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào độ dài của mảng: ");
	    size= scanner.nextInt();
	         
	    // khai báo và cấp phát bộ nhớ cho mảng
	    // mảng này có tên là array và kích thước = size
	    int[] array = new int[size];
	         
	    // array.length: trả về kích thước của mảng
	    // vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
	    for (int i = 0; i < size; i++) {
	        System.out.println("Nhập vào phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();   // nhập giá trị cho phần tử
	    }
	         
	    // hiển thị giá trị các phần tử trong mảng
	    for (int i = 0; i < size; i++) {
	        System.out.println("Phần tử thứ " + i + ": " + array[i]);
	    }
	*/
		//Một số thao tác đối với mảng một chiều
		/*
		//Gán giá trị cho phần tử của mảng
		// khai báo mảng array1 và array2
	    int[] array1 = {2, 10, 3, 9, 8};
	    int array2[] = new int[5];
	         
	    // gán giá trị của phần tử thứ 2 trong mảng array1
	    // cho phần tử thứ 3 trong mảng array2
	    array2[3] = array1[2];
	         
	    System.out.println("Giá trị của phần tử thứ 3 trong mảng array2 = " +
	        array2[3]);
		*/
		/*
		//Sắp xếp các phần tử của mảng
		int n, temp, max = 100;
	    Scanner scanner = new Scanner(System.in);
	    // khai báo và cấp phát bộ nhớ cho mảng A
	    int A[] = new int[max];
	    // nhập số phần tử của mảng
	    // kiểm tra nếu n <= 2 hoặc n > max - 1
	    // thì phải nhập lại
	    do {
	        System.out.println("Nhập số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n <= 2 || n > max-1);
	    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("A[" + i + "] = ");
	        A[i] = scanner.nextInt();
	    }
		
	 	// in ra màn hình mảng số ban đầu
	    System.out.println("Mảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        // in các phần tử trên cùng 1 dòng
	        System.out.print(A[i] + "\t");
	    }
	    // sắp xếp các phần tử trong mảng
	    // vòng lặp for sẽ duyệt i và j
	    // i chạy từ 0 đến n - 2, j chay từ i + 1 đến n - 1
	    // nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
	    // thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i+1; j <= n - 1; j++) {
	            if (A[j] < A[i]) {
	                temp = A[i];
	                A[i] = A[j];
	                A[j] = temp;
	            }
	        }
	    }
	    // in ra màn hình mảng số sau khi sắp xếp
	    System.out.println("\nMảng sau khi sắp xếp: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(A[i] + "\t");
	    }
	    scanner.close();
	    */
		//Tìm kiếm phần tử của mảng theo một điều kiện cho trước
		int n, max = 100, i;
	    int[] A = new int[max];
	    Scanner scanner = new Scanner(System.in);
	    do {
	        System.out.println("Nhập số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n <= 0 || n > max - 1);
	         
	    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
	    for (i = 0; i < n; i++) {
	        System.out.print("A[" + i + "] = ");
	        A[i] = scanner.nextInt();
	    }
	    System.out.println("Nhập số nguyên k cần tìm: ");
	    int k = scanner.nextInt();
	         
	    i = 0;
	    // tiến hành tìm kiếm phần tử
	    // nếu không tìm thấy giá trị tại i bằng với số nguyên k
	    // thì tăng i lên 1
	    while ((i < n) && (A[i] != k)) {
	        i++;
	    }
	    
	    // Nếu i lớn hơn số phần tử của mảng - 1
	    // thì thông báo không tìm thấy phần tử
	    // ngược lại hiển thị ra i
	    if (i > n-1) {
	        System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
	    } else {
	        System.out.println("Phần tử đầu tiên có giá trị bằng " + k + " tại vị trí = " + i);
	    }
	    scanner.close();
	}

}
