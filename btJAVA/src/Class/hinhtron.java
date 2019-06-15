package Class;

import java.util.Scanner;

public class hinhtron extends Pigure {
 
    public float banKinh;
 
    // Constructor
    public hinhtron() {
        ten = "Hình Tròn";
    }
 

    
    public  float tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
        return dienTich;
    }
 
 
    public float tinhChuVi()
    {
    	chuVi = 2 * PI * banKinh;
    	return chuVi;
    }
    
    public float tinhTheTich()
    {
    	return 0.0f;
    }
    public void nhapdulieu()
    {
            System.out.println("Bán kính = ");
            Scanner scanner = new Scanner(System.in);
            banKinh = scanner.nextFloat();
            scanner.close();
     
    }
}
