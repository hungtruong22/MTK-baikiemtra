package dao;

import java.util.ArrayList;
import models.SinhVien;
import models.LopHocPhan;
import models.LopHocPhan_SinhVien;

abstract public class KetNoiRepo {
	private String chuoiKetNoi;
	

	public String getChuoiKetNoi() {
		return chuoiKetNoi;
	}

	public void setChuoiKetNoi(String chuoiKetNoi) {
		this.chuoiKetNoi = chuoiKetNoi;
	}
	
	abstract public ArrayList<SinhVien> getSinhVien();
	abstract public ArrayList<LopHocPhan> getLopHocPhan();
	abstract public ArrayList<LopHocPhan_SinhVien> getLopHocPhan_SinhVien();

}
