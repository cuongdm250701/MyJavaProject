package buoi6;

public class overiding_method {

	public static void main(String[] args) {
		tenNguoiViet tnV = new tenNguoiViet("Do ", "Manh Cuong");
		tnV.showFullName();
		tenNguoiNuocNgoai tnnn = new tenNguoiNuocNgoai("Cuong Manh"," Do");
		tnnn.showFullName();

	}

}