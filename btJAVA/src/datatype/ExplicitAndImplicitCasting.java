package datatype;

public class ExplicitAndImplicitCasting {

	public static void main(String[] args) {
		int height = 6;
        double mass = 220.23456;
         
        // IMPLICIT CASTING
        double result = height;
        System.out.println("Giá trị của biến result sau khi ép kiểu = " + result);  // 6.0
         
        // EXPLICIT CASTING
        int massVal = (int) mass;
        System.out.println("Giá trị biến massValue sau khi ép kiểu = " + massVal);  // 220

	}

}
