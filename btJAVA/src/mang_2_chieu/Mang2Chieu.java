package mang_2_chieu;
import java.util.Scanner;
class Mang2Chieu {

	public static void main(String[] args) {
		/*
		//Truy xuất các phần tử của mảng
		
		// khai báo một mảng 2 chiều có 3 dòng và 2 cột
		int diem[][] = {{1, 2}, {3, 4}, {5, 6}};
			
		System.out.println("Phần tử nằm ở dòng 2 và cột 1 trong mảng diem là " + diem[2][1]);
		*/
		/*
		//Nhập xuất các phần tử cho mảng
		
		// khai báo số dòng và số cột cho mảng
	    int soDong, soCot;
	     
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào số dòng của mảng: ");
	    soDong = scanner.nextInt();
	    System.out.println("Nhập vào số cột của mảng: ");
	    soCot = scanner.nextInt();
	         
	    // khai báo và cấp phát bộ nhớ cho mảng
	    int[][] A = new int[soDong][soCot];
	         
	    // Để nhập giá trị các phần tử cho mảng
	    // chúng ta sẽ sử dụng 2 vòng lặp for
	    // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
	    // và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
	    // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
	    for (int i = 0; i < soDong; i++) {
	        for (int j = 0; j < soCot; j++) {
	            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    // hiển thị các phần tử trong mảng vừa nhập
	    // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
	    System.out.println("Mảng vừa nhập: ");
	    for (int i = 0; i < soDong; i++) {
	        for (int j = 0; j < soCot; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        // sau khi viết xong 1 dòng thi xuống hàng
	        System.out.println("\n");   
	    }scanner.close();
		*/
		
		//Một số ví dụ về thao tác đối với mảng hai chiều
		
			//Ví dụ 1
			/*
		int m;  // số dòng của ma trận
	    int n;  // số cột của ma trận
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số dòng của ma trận:");
	        m = scanner.nextInt();
	        System.out.println("Nhập vào số cột của ma trận:");
	        n = scanner.nextInt();
	    } while (m < 1 || n < 1);
	         
	    // khai báo 2 ma trận A và B có m dòng và n cột
	    int A[][] = new int[m][n];
	    int B[][] = new int[m][n];
	         
	    // ma trận tổng C
	    int C[][] = new int [m][n];
	         
	    System.out.println("Nhập các phần tử cho ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("A[" + i + "," + j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    System.out.println("Nhập các phần tử cho ma trận B:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("B[" + i + "," + j + "] = ");
	            B[i][j] = scanner.nextInt();
	        }
	    }
	         
	    System.out.println("Ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	         
	    System.out.println("Ma trận B:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(B[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	         
	    // Để tính tổng hai ma trận
	    // ta sẽ sử dụng 2 vòng lặp for
	    // để duyệt i từ 0 đến m và j từ 0 đến n
	    // sau đó tính tổng hai phần tử
	    // tại vị trí i, j tương ứng của 2 ma trận A, B
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            C[i][j] = A[i][j] + B[i][j];
	        }
	    }
	         
	    // hiển thị ma trận tổng C
	    System.out.println("Ma trận tổng C:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(C[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }scanner.close();
			*/
			//Ví dụ 2
			/*
		int m, n;
	    int soPhanTu0 = 0;      // số phần tử = 0 trong ma trận
	    int soPhanTuKhac0 = 0;  // số phần tử khác 0 trong ma trận
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số dòng của ma trận:");
	        m = scanner.nextInt();
	        System.out.println("Nhập vào số cột của ma trận:");
	        n = scanner.nextInt();
	    } while (m < 1 || n < 1);
	         
	    // khai báo ma trận A có m dòng, n cột
	    int A[][] = new int[m][n];
	         
	    System.out.println("Nhập các phần tử cho ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("A[" + i + "," + j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    System.out.println("Ma trận A vừa nhập:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	         
	    // kiểm tra ma trận thưa hay không thưa
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            // kiểm tra nếu phần tử tại i, j bằng 0
	            // thì tăng biến soPhanTu0 lên 1
	            // ngược lại tăng biến soPhanTuKhac0 lên 1
	            if (A[i][j] == 0) {
	                soPhanTu0++;
	            } else {
	                soPhanTuKhac0++;
	            }
	        }
	    }
	         
	    // nếu biến soPhanTu0 lớn hơn soPhanTuKhac0
	    // thì ma trận đó là ma trận thưa
	    // ngược lại là ma trận không thưa
	    if (soPhanTu0 > soPhanTuKhac0) {
	        System.out.println("Ma trận vừa nhập là ma trận thưa");
	    } else {
	        System.out.println("Ma trận vừa nhập là ma trận không thưa");
	    }scanner.close();
			 */
			//Ví dụ 3
		int n;  // bậc của ma trận 
	    int kt = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số bậc của ma trận: ");
	        n = scanner.nextInt();
	    } while (n < 1);
	         
	    // ma trận A là ma trận vuông
	    // có n dòng và n cột
	    int[][] A = new int[n][n];
	         
	    System.out.println("Nhập các phần tử cho ma trận A:");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("A[" + i + "," + j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	         
	    System.out.println("Ma trận A vừa nhập:");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	         
	    // kiểm tra các phần tử nằm dưới đường chéo chính
	    // và phần tử đối xứng với nó qua đường chéo chính
	    // có bằng nhau hay không
	    // nếu bằng nhau thì ma trận đó là ma trận đối xứng
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < i; j++) {
	            if (A[i][j] == A[j][i]) {
	                kt = 1;
	            } else {
	                kt = 0;
	            }
	        }
	    }
	         
	    if (kt == 1) {
	        System.out.println("Ma trận vừa nhập là ma trận đối xứng");
	    } else {
	        System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
	    }scanner.close();
		
	}

}
