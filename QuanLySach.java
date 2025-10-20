import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySach implements IKiemKe { 
    private ArrayList<Sach> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public ArrayList<Sach> getDanhSach() {
        return danhSach;
    }
    private double nhapSoThuc(String thongBao) {
        double so = 0;
        boolean nhapThanhCong = false;
        while (!nhapThanhCong) {
            System.out.print(thongBao);
            try {
                so = Double.parseDouble(sc.nextLine());
                if (so < 0) {
                     System.out.println("Loi: Gia tri khong duoc am.");
                     continue;
                }
                nhapThanhCong = true;
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap mot so hop le.");
            }
        }
        return so;
    }
    private int nhapSoNguyen(String thongBao) {
        int so = 0;
        boolean nhapThanhCong = false;
        while (!nhapThanhCong) {
            System.out.print(thongBao);
            try {
                so = Integer.parseInt(sc.nextLine());
                if (so < 0) {
                     System.out.println("Loi: Gia tri khong duoc am.");
                     continue;
                }
                nhapThanhCong = true;
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap mot so nguyen hop le.");
            }
        }
        return so;
    }
    public void themSach() {
        System.out.println("\n--- THEM SACH ---");
        System.out.println("1. Sach Giao Trinh");
        System.out.println("2. Sach Tieu Thuyet");
        System.out.print("Chon loai sach: ");
        String loai = sc.nextLine();
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        String td = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tg = sc.nextLine();
        int nam = nhapSoNguyen("Nhap nam xuat ban: ");
        int sl = nhapSoNguyen("Nhap so luong: ");
        double gcb = nhapSoThuc("Nhap gia co ban (VND): ");
        if (loai.equals("1")) {
            System.out.print("Nhap mon hoc: ");
            String mh = sc.nextLine();
            System.out.print("Nhap cap do: ");
            String cd = sc.nextLine();
            danhSach.add(new SachGiaoTrinh(ma, td, tg, nam, sl, gcb, mh, cd)); 
            System.out.println("Them Sach Giao Trinh thanh cong!");
        } else if (loai.equals("2")) {
            System.out.print("Nhap the loai: ");
            String tl = sc.nextLine();
            boolean series = false;
            boolean validSeries = false;
            while(!validSeries) {
                 System.out.print("Sach thuoc series? (true/false): ");
                 String input = sc.nextLine();
                 if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                     series = Boolean.parseBoolean(input);
                     validSeries = true;
                 } else {
                     System.out.println("Loi: Vui long nhap 'true' hoac 'false'.");
                 }
            }
            danhSach.add(new SachTieuThuyet(ma, td, tg, nam, sl, gcb, tl, series)); 
            System.out.println("Them Sach Tieu Thuyet thanh cong!");
        } else {
            System.out.println("Loai sach khong hop le!");
        }
    }
    public void hienThiTatCa() {
        System.out.println("\n--- DANH SACH SACH ---");
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            for (Sach s : danhSach) {
                System.out.println(s);
            }
        }
    }
    public Sach timKiemTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }
    public void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        Sach s = timKiemTheoMa(ma);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + ma);
        } else {
            System.out.println("Khong tim thay sach co ma: " + ma);
        }
    }

    public void capNhatSach() {
        System.out.print("Nhap ma sach can cap nhat: ");
        String ma = sc.nextLine();
        Sach s = timKiemTheoMa(ma);
        if (s != null) {
            System.out.print("Nhap tieu de moi: ");
            s.setTieuDe(sc.nextLine());
            System.out.print("Nhap tac gia moi: ");
            s.setTacGia(sc.nextLine());
            s.setNamXuatBan(nhapSoNguyen("Nhap nam xuat ban moi: "));
            s.setSoLuong(nhapSoNguyen("Nhap so luong moi: "));
            s.setGiaCoBan(nhapSoThuc("Nhap gia co ban moi (VND): "));
            System.out.println("Da cap nhat thong tin sach!");
        } else {
            System.out.println("Khong tim thay sach de cap nhat!");
        }
    }
    @Override
    public void thucHienKiemKe() {
        if (danhSach.isEmpty()) {
            System.out.println("Khong co sach de kiem ke!");
            return;
        }
        System.out.println("\n--- THUC HIEN KIEM KE TOAN BO SACH ---");
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        for (Sach s : danhSach) {
            tongSoLuong += s.getSoLuong();
            tongGiaTri += s.getSoLuong() * s.tinhGiaBan(); 
        }
        System.out.println("TONG SO LUONG SACH TRONG KHO: " + tongSoLuong + " cuon");
        System.out.println("TONG GIA TRI KIEM KE (GIA BAN): " + String.format("%,.0f", tongGiaTri) + " VNĐ");
        System.out.println("Kiem ke hoan tat.");
    }
}