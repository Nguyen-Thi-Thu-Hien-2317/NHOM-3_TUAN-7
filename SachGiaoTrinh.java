public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    private final int NAM_HIEN_TAI = 2025;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = NAM_HIEN_TAI - getNamXuatBan();
        double giaThem = soNamDaXuatBan * 5000;
        return getGiaCoBan() + giaThem;
    }
    
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }
    
    @Override
    public String toString() {
        return super.toString() +
               "Mon hoc: " + monHoc + "\n" +
               "Cap do: " + capDo + "\n" +
               "GIA BAN: " + String.format("%,.0f", tinhGiaBan()) + " VNĐ\n" +
               "---------------------------";
    }
}