package models;

public class SinhVien {
	private String MaSinhVien;
	private String HoDem;
	private String Ten;
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSinhVien, String hoDem, String ten) {
		super();
		MaSinhVien = maSinhVien;
		HoDem = hoDem;
		Ten = ten;
	}
	public String getMaSinhVien() {
		return MaSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		MaSinhVien = maSinhVien;
	}
	public String getHoDem() {
		return HoDem;
	}
	public void setHoDem(String hoDem) {
		HoDem = hoDem;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	@Override
	public String toString() {
		return "SinhVien [MaSinhVien=" + MaSinhVien + ", HoDem=" + HoDem + ", Ten=" + Ten + "]";
	}
	
	
	
}
