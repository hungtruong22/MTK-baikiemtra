package ui;

import java.util.ArrayList;

import dao.KetNoiRepo;
import dao.KetNoiRepoCsdl;
import models.CauHinhChuongTrinh;
import models.LopHocPhan;
import models.LopHocPhan_SinhVien;
import models.SinhVien;

public class ChuongTrinh {
	private static void runTest() {
		CauHinhChuongTrinh cauHinh = CauHinhChuongTrinh.getInstance(null);

		KetNoiRepo repo = null;
		if (cauHinh.getLoai() == "CSDL") {
			repo = new KetNoiRepoCsdl(cauHinh.getConnectionString());
			
		} else {
			
		}
				
		System.out.println("Câu 1");
		ArrayList<LopHocPhan> dslhp = repo.getLopHocPhan();
		int stt = 1;
		System.out.println("-----DANH SÁCH CÁC LỚP HỌC PHẦN-----");
		System.out.println("STT" + "\tMã Lớp Học Phần" + "\t\tTên Lớp Học Phần");
		for(LopHocPhan lhp : dslhp) {
			System.out.println(stt + "\t" +lhp.getMaLop() + "\t\t\t" + lhp.getTenLop());
			stt++;
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Câu 2");
		int stt1 = 1;
		ArrayList<SinhVien> dssv = repo.getSinhVien();
		ArrayList<LopHocPhan_SinhVien> ds = repo.getLopHocPhan_SinhVien();
		
		for(LopHocPhan lhp : dslhp) {
			System.out.println("Mã Lớp Học Phần: " + lhp.getMaLop());
			System.out.println("Tên Lớp Học Phần: " + lhp.getTenLop());
			System.out.println("Danh sách sinh viên:");
			System.out.println("STT" + "\tMã Sinh Viên" + "\t\tHọ Đệm" +
								"\t\t\tTên" + "\t\tNgày Đăng Ký");
			for(LopHocPhan_SinhVien ls : ds) {
				if(lhp.getMaLop().toLowerCase().equals(ls.getMaLop().toLowerCase())) {
					for(SinhVien sv : dssv) {
						if(ls.getMaSinhVien().toLowerCase().equals(sv.getMaSinhVien().toLowerCase())) {
							System.out.println(stt1 + "\t" + sv.getMaSinhVien() + 
									"\t\t\t" + sv.getHoDem() + "\t\t" +sv.getTen() +
									"\t\t" + ls.getNgayDangKy());
							stt1++;
						}
					}
				}
			}
			System.out.println("----------------------------------------------------------------------------------------");
			stt1 = 1;
		}
	}
	
	public static void main(String[] args) {
		// tạo phthuc run()
		runTest();
	}
}
