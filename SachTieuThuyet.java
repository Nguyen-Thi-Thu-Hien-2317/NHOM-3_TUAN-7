package JAVA.T7_hdt;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia,
                          double giaCoBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tenSach, tacGia, giaCoBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return laSachSeries ? (giaCoBan + 15000) : (giaCoBan + 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", The loai: " + theLoai +
               ", La series: " + (laSachSeries ? "Co" : "Khong") +
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

