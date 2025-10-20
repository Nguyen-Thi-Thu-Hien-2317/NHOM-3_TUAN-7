import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhap sach giao trinh");
            System.out.println("2. Nhap sach tieu thuyet");
            System.out.println("3. Hien thi tat ca sach");
            System.out.println("4. Kiem tra ton kho va cap nhat vi tri");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống

            switch (chon) {
                case 1: {
                    System.out.print("Nhap so luong sach giao trinh: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap sach giao trinh thu " + (i + 1) + " ---");
                        System.out.print("Ma sach: ");
                        String ma = sc.nextLine();
                        System.out.print("Tua de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB: ");
                        int nam = sc.nextInt();
                        System.out.print("So luong: ");
                        int sl = sc.nextInt();
                        System.out.print("Gia co ban: ");
                        double gia = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Mon hoc: ");
                        String mh = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cd = sc.nextLine();

                        Sach s = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mh, cd);
                        ql.themSach(s);
                    }
                    break;
                }

                case 2: {
                    System.out.print("Nhap so luong sach tieu thuyet: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap sach tieu thuyet thu " + (i + 1) + " ---");
                        System.out.print("Ma sach: ");
                        String ma = sc.nextLine();
                        System.out.print("Tua de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB: ");
                        int nam = sc.nextInt();
                        System.out.print("So luong: ");
                        int sl = sc.nextInt();
                        System.out.print("Gia co ban: ");
                        double gia = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("Co phai series (true/false): ");
                        boolean sr = sc.nextBoolean();
                        sc.nextLine();

                        Sach s = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, sr);
                        ql.themSach(s);
                    }
                    break;
                }

                case 3:
                    ql.hienThiTatCa();
                    break;

                case 4: {
                    System.out.print("Nhap ma sach muon kiem tra ton kho: ");
                    String ma = sc.nextLine();
                    Sach sachTim = null;
                    for (Sach s : ql.getDanhSach()) {
                        if (s.getMaSach().equalsIgnoreCase(ma)) {
                            sachTim = s;
                            break;
                        }
                    }
                    if (sachTim == null) {
                        System.out.println("Khong tim thay sach!");
                    } else {
                        IKiemKe kk = (IKiemKe) sachTim;
                        System.out.print("Nhap so luong toi thieu: ");
                        int slMin = sc.nextInt();
                        sc.nextLine();
                        boolean du = kk.kiemTraTonKho(slMin);
                        System.out.println("Kiem tra ton kho >= " + slMin + ": " + du);
                        System.out.print("Nhap vi tri moi: ");
                        String vt = sc.nextLine();
                        kk.capNhatViTri(vt);
                    }
                    break;
                }

                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
