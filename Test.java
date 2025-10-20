package JAVA.T7_hdt;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();

        System.out.print("Nhap so luong sach can them: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nChon loai sach (1 - Giao trinh, 2 - Tieu thuyet): ");
            int loai = Integer.parseInt(sc.nextLine());

            System.out.print("Ma sach: ");
            String ma = sc.nextLine();
            System.out.print("Ten sach: ");
            String ten = sc.nextLine();
            System.out.print("Tac gia: ");
            String tacGia = sc.nextLine();
            System.out.print("Gia co ban: ");
            double gia = Double.parseDouble(sc.nextLine());
            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            if (loai == 1) {
                System.out.print("Mon hoc: ");
                String monHoc = sc.nextLine();
                System.out.print("Cap do: ");
                String capDo = sc.nextLine();

                SachGiaoTrinh sg = new SachGiaoTrinh(ma, ten, tacGia, gia, soLuong, monHoc, capDo);
                ql.themSach(sg);
            } else {
                System.out.print("The loai: ");
                String theLoai = sc.nextLine();
                System.out.print("La sach series? (true/false): ");
                boolean series = Boolean.parseBoolean(sc.nextLine());

                SachTieuThuyet stt = new SachTieuThuyet(ma, ten, tacGia, gia, soLuong, theLoai, series);
                ql.themSach(stt);
            }
        }

        ql.hienThiDanhSachSach();

        System.out.println("\n=== KIEM TRA KHO ===");
        System.out.print("Nhap so luong toi thieu de kiem tra ton kho: ");
        int slMin = Integer.parseInt(sc.nextLine());

        for (Sach s : ql.danhSachSach) {
            if (s instanceof IKiemKe) {
                IKiemKe k = (IKiemKe) s;
                System.out.println("Sach [" + s.getTenSach() + "] du hang? " + k.kiemTraTonKho(slMin));
            }
        }

        System.out.println("\n=== CAP NHAT VI TRI ===");
        for (Sach s : ql.danhSachSach) {
            if (s instanceof IKiemKe) {
                System.out.print("Nhap vi tri moi cho sach [" + s.getTenSach() + "]: ");
                String vt = sc.nextLine();
                ((IKiemKe) s).capNhatViTri(vt);
            }
        }

        sc.close();
    }
}
