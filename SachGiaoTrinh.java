import java.util.Scanner;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capHoc;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capHoc = capHoc;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTinChung(sc);
        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();
        System.out.print("Nhap cap hoc: ");
        capHoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Mon hoc: " + monHoc +
               ", Cap hoc: " + capHoc +
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