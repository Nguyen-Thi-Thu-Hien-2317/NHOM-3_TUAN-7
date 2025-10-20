package JAVA.T7_hdt;

public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected double giaCoBan;
    protected int soLuong;

    public Sach(String maSach, String tenSach, String tacGia, double giaCoBan, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
    }

    public abstract double tinhGiaBan();

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
               ", Ten sach: " + tenSach +
               ", Tac gia: " + tacGia +
               ", Gia co ban: " + giaCoBan +
               ", So luong: " + soLuong;
    }
}
