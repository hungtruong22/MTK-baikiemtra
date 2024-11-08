package models;

public class LopHocPhan {
	private String MaLop;
	private String TenLop;
	public LopHocPhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LopHocPhan(String maLop, String tenLop) {
		super();
		MaLop = maLop;
		TenLop = tenLop;
	}
	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}
	public String getTenLop() {
		return TenLop;
	}
	public void setTenLop(String tenLop) {
		TenLop = tenLop;
	}
	@Override
	public String toString() {
		return "LopHocPhan [MaLop=" + MaLop + ", TenLop=" + TenLop + "]";
	}
	
	
}
