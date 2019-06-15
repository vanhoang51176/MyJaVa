package Class;

import java.util.Scanner;

public class HinhChuNhat extends Pigure {
 
    public float dai;
    public float rong;
 
    // Constructor
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }
 
 

    public  float tinhChuVi()
    {
    	chuVi = 2 * (dai + rong);
    	return chuVi;
    }
    
    public float tinhDienTich()
    {
    	dienTich = dai * rong;
    	return dienTich;
    }
    public float tinhTheTich()
    {
    	return 0.0f;
    }
    public void nhapdulieu()
    {
    	System.out.println("Chiều dài = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
        System.out.println("Chiều rộng = ");
        rong = scanner.nextFloat();
        scanner.close();
    }
}

