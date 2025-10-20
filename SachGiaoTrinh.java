package JAVA.T7_hdt;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia,
                         double giaCoBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, giaCoBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (5 * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Mon hoc: " + monHoc +
               ", Cap do: " + capDo +
               ", Gia uoc tinh: " + tinhGiaBan() + " VND";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + tenSach + "] den khu vuc: " + viTriMoi);
    }
}

