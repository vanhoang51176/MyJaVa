package datatype;

public class ImplicitCasting {

	public static void main(String[] args) {
		/*
         * Ép kiểu rộng
         */
        int i = 100;    
        long l = i;     // chuyển từ kiểu dữ liệu integer lên kiểu long
        float f = l;    // chuyển từ kiểu dữ liệu long lên kiểu float
        System.out.println("Giá trị biến i = " + i);
        System.out.println("Giá trị biến l = " + l);
        System.out.println("Giá trị biến f = " + f);

	}

}
