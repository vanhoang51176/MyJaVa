package Class;
import java.util.Scanner;

public class hinhtru extends Pigure {
 
    public float chieuCao, banKinh ;
    
    // Constructor
    public hinhtru() {
        ten = "Hình Trụ";
       
    }
 
 

    public  float tinhChuVi()
    {
    	chuVi = 2 * PI * banKinh;
    	return chuVi;
    }
    
    public float tinhDienTich()
    {
        dienTich = PI * banKinh * banKinh;
        return dienTich;
    }
    public float tinhTheTich()
    {	
    	tinhDienTich();
        theTich = dienTich * chieuCao;
    	return theTich;
    }
    public void nhapdulieu()
    {
    	System.out.println("Bán kính = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    	 
         System.out.println("Chiều cao = ");

         chieuCao = scanner.nextFloat();
         scanner.close();
    }
}