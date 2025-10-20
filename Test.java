import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();

        System.out.println("Nhap thong tin sach giao trinh:");
        SachGiaoTrinh sgk = new SachGiaoTrinh();
        sgk.nhapThongTin(sc);
        ql.themSach(sgk);

        System.out.println("\nNhap thong tin sach tieu thuyet:");
        SachTieuThuyet stt = new SachTieuThuyet();
        stt.nhapThongTin(sc);
        ql.themSach(stt);

        System.out.println("\n===== HIEN THI DANH SACH =====");
        ql.hienThiDanhSachSach();

        // Thu nghiem giao dien IKiemKe
        IKiemKe kiemKe = sgk;
        System.out.print("\nNhap so luong toi thieu can kiem tra: ");
        int soLuongToiThieu = Integer.parseInt(sc.nextLine());
        System.out.println("Kiem tra ton kho >= " + soLuongToiThieu + ": " + kiemKe.kiemTraTonKho(soLuongToiThieu));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");

        sc.close();
    }
}