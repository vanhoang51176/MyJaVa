package chuoi_java;
import java.util.Scanner;
class ChuoiJava {

	/*public static void main(String[] args) {
		 // khai báo chuỗi rỗng
	    String chuoi1 = "";
	         
	    // khai báo chuỗi có nội dung là "Welcome"
	    String chuoi2 = "Welcome";
	         
	    // hiển thị giá trị của 2 chuỗi trên ra màn hình
	    System.out.println("Chuỗi rỗng có giá trị = " + chuoi1);
	    System.out.println("Chuỗi 2 có giá trị = " + chuoi2);

	}


	 */
	public static void main(String[] args) {
    /*// khai báo một chuỗi có nội dung là "Welcome to Java!"
    String chuoi = new String("Welcome to Java!");
    System.out.println(chuoi);
    */
	 
		/* String chuoi;
		    int doDai;
		    Scanner scanner = new Scanner(System.in);
		         
		    System.out.println("Nhập vào chuỗi bất kỳ từ bàn phím: ");
		    chuoi = scanner.nextLine();
		         
		    // tính độ dài chuỗi
		    doDai = chuoi.length();
		         
		    System.out.println("Chuỗi " + chuoi + " có độ dài = " + doDai);
		    scanner.close();	*/
	
		    /*String chuoi1 = "Happy ", chuoi2 = "new year!";
		 
		    /* 
		     * nối chuỗi
		     
		    String chuoi3 = chuoi1.concat(chuoi2);
		    System.out.println(chuoi3); 
		    */
			/*String chuoi = "Happy new year!";
        
			/* 
			 * trả về ký tự có chỉ số là 4 trong chuỗi
			 * ký tự 'H' có chỉ số là 0 
			 * nên ký tự có chỉ số 4 là ký tự 'y'
			 *
			char character = chuoi.charAt(4);
			System.out.println(character);
			*/
			/*
			int result;
			String string1 = "Happy new year!";
			String string2 = "Happy new year!";
	         
			result = string1.compareTo(string2);
			if (result == 0) {
				System.out.println("Chuỗi " + string1 + " = " + string2);
			} else if (result < 0) {
				System.out.println("Chuỗi " + string1 + " < " + string2);
			} else {
				System.out.println("Chuỗi " + string1 + " > " + string2);
			}
			*/
		/*
		 	int result;
		    String string1 = "Happy new year!";
		    String string2 = "new year!";
		         
		    result = string1.indexOf(string2);
		    System.out.println("Vị trí đầu tiên xuất hiện chuỗi " + string2 + 
		        " trong chuỗi " + string1 + " = " + result);
	*/	
			/*
			int result;
			String string1 = "Happy new year and new year!";
			String string2 = "new year!";
	         
			result = string1.lastIndexOf(string2);
			System.out.println("Vị trí cuối cùng xuất hiện chuỗi " + string2 + 
	    		" trong chuỗi " + string1 + " = " + result);
	    		*/
		/*int result;
	    String string1 = "Happy new year and new year!";
	    String string2 = "new year!";
	         
	    result = string1.lastIndexOf(string2);
	    System.out.println("Vị trí cuối cùng xuất hiện chuỗi " + string2 + 
	        " trong chuỗi " + string1 + " = " + result);
		*/
		/*
		 String string1 = new String("Happy new year!");
         
		    // ký tự thay thế 'l' không có trong chuỗi string1
		    System.out.println(string1.replace('l', 'r'));
		         
		    // thay thế ký tự 'y' trong string1 thành 'r'
		    System.out.println("Chuỗi sau khi thay thế là " + 
		        string1.replace('y', 'r'));
		*/
		/*Hàm thay thế một chuỗi con trong chuỗi ký tự bằng chuỗi khác*/
		/*
		String string1 = new String("   Welcome to Freetuts.net!   ");
        
	    // loại bỏ các khoảng trắng thừa trong chuỗi string1
	    string1 = string1.trim();
	         
	    System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa là " + string1);
	    */
		/*
		Hàm tạo một chuỗi con từ vị trí index trong chuỗi cha
		*/
		/*
		String chuoiCha = new String("Welcome to Freetuts.net!");
        
	    // tạo một chuỗi con từ vị trí 11 trong chuỗi string1
	    String chuoiCon1 = chuoiCha.substring(11);  // Freetuts.net!
	    System.out.println(chuoiCon1);
	         
	    /*
	     * tách một chuỗi con bắt đầu từ vị trí 11
	     * và kết thúc tại vị trí 19 trong chuỗi cha
	     
	    String chuoiCon2 = chuoiCha.substring(11, 19);  // Freetuts
	    System.out.println(chuoiCon2);
		*/
	}		
}


