package Class;
import java.util.Scanner;

public class HinhVuong extends Pigure {
	public float canh ;
 
    // Constructor
    public HinhVuong() {
        ten = "Hình Vuông";
    }
    public  float tinhChuVi()
    {
    	chuVi = canh *4 ;
    	return chuVi;
    }
    
    public float tinhDienTich()
    {
    	dienTich = canh * canh;
    	return dienTich;
    }
    public float tinhTheTich()
    {
    	return 0.0f;
    }
    public void nhapdulieu()
    {
    	 System.out.println("Cạnh = ");
         Scanner scanner = new Scanner(System.in);
         canh = scanner.nextFloat();
         scanner.close();
    }
}