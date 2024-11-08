package models;

import java.util.Date;

public class LopHocPhan_SinhVien {
	private String MaLop;
	private String MaSinhVien;
	private Date NgayDangKy;
	public LopHocPhan_SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public LopHocPhan_SinhVien(String maLop, String maSinhVien, Date ngayDangKy) {
		super();
		MaLop = maLop;
		MaSinhVien = maSinhVien;
		NgayDangKy = ngayDangKy;
	}

	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}
	public String getMaSinhVien() {
		return MaSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		MaSinhVien = maSinhVien;
	}
	public Date getNgayDangKy() {
		return NgayDangKy;
	}
	public void setNgayDangKy(Date ngayDangKy) {
		NgayDangKy = ngayDangKy;
	}
	@Override
	public String toString() {
		return "LopHocPhan_SinhVien [MaLop=" + MaLop + ", MaSinhVien=" + MaSinhVien + ", NgayDangKy=" + NgayDangKy
				+ "]";
	}
	
	
	
}
