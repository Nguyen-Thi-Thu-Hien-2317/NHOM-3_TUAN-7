import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public ArrayList<Sach> getDanhSach() {
        return danhSach;
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("===== DANH SACH SACH =====");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
                System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
            }
        }
    }
}
