import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();
        qls.getDanhSach().add(new SachGiaoTrinh("GT001", "Toan Cao Cap", "Nguyen Van A", 2020, 50, 100000, "Toan", "Dai Hoc"));
        qls.getDanhSach().add(new SachTieuThuyet("TT001", "Co Giao Thao", "Nguyen Van B", 2018, 30, 85000, "Lang Man", true));
        System.out.println("Da them san 2 cuon sach de thu nghiem tinh Gia Ban.");
        while (true) {
            System.out.println("\n===== MENU QUAN LY SACH (TINH TRU TUONG & INTERFACE) =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi tat ca sach (Kiem tra Gia Ban)");
            System.out.println("3. Xoa sach theo ma");
            System.out.println("4. Cap nhat thong tin sach theo ma");
            System.out.println("5. THUC HIEN KIEM KE (Interface IKiemKe)"); // <--- Đã thêm chức năng
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");         
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    qls.themSach();
                    break;
                case "2":
                    qls.hienThiTatCa();
                    break;
                case "3":
                    qls.xoaSach();
                    break;
                case "4":
                    qls.capNhatSach();
                    break;
                case "5": 
                    qls.thucHienKiemKe();
                    break;
                case "0":
                    System.out.println("Thoat chuong trinh...");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}