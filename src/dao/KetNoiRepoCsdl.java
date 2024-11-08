package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import models.LopHocPhan;
import models.LopHocPhan_SinhVien;
import models.SinhVien;

public class KetNoiRepoCsdl extends KetNoiRepo{

	
	@Override
	public ArrayList<SinhVien> getSinhVien() {
		// kết nối đến csdl thông qua chuoiKetNoi this.getChuoiKetNoi
				// tạo stmt
				// thực thi stmt -> resulSet
				// return list
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = DriverManager.getConnection(this.getChuoiKetNoi());
		
			String sql = "select * from SinhVien";
			PreparedStatement cmd = cn.prepareStatement(sql);
    		ResultSet rs = cmd.executeQuery();
    		
    		while(rs.next()) {
    			String MaSinhVien = rs.getString("MaSinhVien");
    			String HoDem = rs.getString("HoDem");
    			String Ten = rs.getString("Ten");
    			
    			SinhVien sv = new SinhVien(MaSinhVien, HoDem, Ten);
    			ds.add(sv);
    		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}

	@Override
	public ArrayList<LopHocPhan> getLopHocPhan() {
		ArrayList<LopHocPhan> ds = new ArrayList<LopHocPhan>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = DriverManager.getConnection(this.getChuoiKetNoi());
		
			String sql = "select * from LopHocPhan";
			PreparedStatement cmd = cn.prepareStatement(sql);
    		ResultSet rs = cmd.executeQuery();
    		
    		while(rs.next()) {
    			String MaLop = rs.getString("MaLop");
    			String TenLop = rs.getString("TenLop");
    			
    			LopHocPhan lhp = new LopHocPhan(MaLop, TenLop);
    			ds.add(lhp);
    		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}

	@Override
	public ArrayList<LopHocPhan_SinhVien> getLopHocPhan_SinhVien() {
		ArrayList<LopHocPhan_SinhVien> ds = new ArrayList<LopHocPhan_SinhVien>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection cn = DriverManager.getConnection(this.getChuoiKetNoi());
		
			String sql = "select * from LopHocPhan_SinhVien";
			PreparedStatement cmd = cn.prepareStatement(sql);
    		ResultSet rs = cmd.executeQuery();
    		
    		while(rs.next()) {
    			String MaLop = rs.getString("MaLop");
    			String MaSinhVien = rs.getString("MaSinhVien");
    			Date NgayDangKy = rs.getDate("NgayDangKy");
    			
    			LopHocPhan_SinhVien ls = new LopHocPhan_SinhVien(MaLop, MaSinhVien, NgayDangKy);
    			ds.add(ls);
    		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}

	public KetNoiRepoCsdl (String ChuoiKetNoi) {
		this.setChuoiKetNoi(ChuoiKetNoi);
	}
	
}
