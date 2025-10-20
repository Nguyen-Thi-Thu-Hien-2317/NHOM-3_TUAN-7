package JAVA.T7_hdt;

import java.util.ArrayList;

public class QuanLySach {
    public ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() {
        System.out.println("\n=== DANH SACH TRONG KHO ===");
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
        }
    }
}

