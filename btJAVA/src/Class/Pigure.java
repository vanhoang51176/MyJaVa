package Class;

class Pigure {
	public final float PI=3.14f;
	public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
 
    public void xuatTen() {
        System.out.println("\n\n===== " + ten + " =====");
    }
 
    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }
 
    public void inDienTich() {
        System.out.println("Diện tích = " + dienTich);
    }
 
    public void inTheTich() {
        System.out.println("Thể tích = " + theTich);
    }
	
    public  float tinhChuVi()
    {
    	return 0.0f;
    }
    
    public float tinhDienTich()
    {
    	return 0.0f;
    }
    public float tinhTheTich()
    {
    	return 0.0f;
    }
    public void nhapdulieu()
    {
    
    }
}