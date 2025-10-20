import java.util.Scanner;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private boolean laSachSeries;

    public SachTieuThuyet() {
        super();
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTinChung(sc);
        System.out.print("Sach co phai la series khong (true/false): ");
        laSachSeries = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() +
               ", La sach series: " + (laSachSeries ? "Co" : "Khong") +
               ", Gia ban: " + tinhGiaBan() + " VND";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }
}