package break_continue;

class TiepTuc {

	public static void main(String[] args) {
		int count;
	    for (count = 1; count <= 5; count++) {
	        System.out.println("Lần lặp " + count);
	             
	        /* 
	         * kiểm tra nếu count còn nhỏ hơn 4
	         * thì còn quay lại vòng for kiểm tra điều kiện lặp 
	         */
	        if (count < 4) {
	            continue;
	        }
	             
	        // Nếu count không nhỏ hơn 4 thì hiển thị "Chào bạn!"
	        System.out.println("Chào bạn!");
	    
	    }
	}

}
