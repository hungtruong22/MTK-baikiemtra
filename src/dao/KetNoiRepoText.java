package dao;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import models.SinhVien;

public class KetNoiRepoText {
	public ArrayList<SinhVien> getSinhVien() {
		try {
			ArrayList<String> ds = new ArrayList<String>();
			FileWriter f= new FileWriter("LOP.txt");
			PrintWriter ghi= new PrintWriter(f);
			for(String h : ds) {
			ghi.println(h);
			}
			ghi.close();	
			String filename = this.getChuoiKetNoi();
			// TODO mở file this.getChuoiKetNoi()
			// đọc từng dòng và xử lý
			// return danh sách sinh viên
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public KetNoiRepoText (String ChuoiKetNoi) {
		this.setChuoiKetNoi(ChuoiKetNoi);
	}
}
