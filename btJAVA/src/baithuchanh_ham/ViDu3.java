package baithuchanh_ham;
import java.util.Scanner;
class ViDu3 {
	public static float TimMax(float a, float b)
	{	

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
         
		float max ;
		if(a > b) 
		{
			max = a;
		}
		else 
		{
			max = b;
		}
		return max;
		
			
	}
	public static void main(String[] args) {
		System.out.println("So lon nhat la : "+ TimMax(0,0));
	}

}
