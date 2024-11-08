package models;


public class CauHinhChuongTrinh {
private String loai, connectionString;
	
	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	private static CauHinhChuongTrinh _instance = null;
	
	public static CauHinhChuongTrinh getInstance(CauHinhChuongTrinh _instance) {
		if(_instance == null) {
			// nạp dữ liệu từ file config.ini
			_instance = new CauHinhChuongTrinh();
			_instance.setLoai("CSDL");
			_instance.setConnectionString("jdbc:sqlserver://DESKTOP-RQV86U4:1433;databaseName=DP01-20T1020390;user=sa;password=truongminhhung");
			
			
		}
		return _instance;
	}
}
