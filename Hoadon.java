
package hoadon;
import static java.lang.System.in;
import java.util.Scanner;

public class Hoadon {
    private int makh;
    private String hoten, ngayrahd;
    private int soluong;
    private double dongia;
    private double thanhtien;
    Scanner scanner = new Scanner(System.in);
    
    public Hoadon() {
        super();
    }
    
    public Hoadon(int makh, String hoten, String ngayrahd, int soluong, float dongia, double thanhtien){
        this.makh = makh;
        this.hoten = hoten;
        this.ngayrahd = ngayrahd;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }
    public int getmakh() {
       return makh;
}
    public void setmakh(int makh) {
       makh = makh;
}
    public double getdongia() {
       return dongia;
}
    public void setdongia(double dongia) {
       dongia = dongia;
}
    public String getngayrahd() {
       return ngayrahd;
}
    public void setngayrahd(String ngayrrahd) {
       ngayrahd = ngayrahd;
}
    public String gethoten() {
       return hoten;
}
    public void sethoten(String hoten) {
       hoten = hoten;
}
    public int getsoluong() {
       return soluong;
}
    public void setsoluong(int soluong) {
       soluong = soluong;
}
    public double getthanhtien() {
       return thanhtien;
}
    public void setthanhtien(double thanhtien) {
       thanhtien = thanhtien;
}
    public void nhap()
{
    System.out.println("Nhap Ma Khach Hang: ");
         makh = in.nextInt();
    System.out.println("Ho va Ten Khach Hang: ");
         hoten = in.next();
    System.out.println("Ngay Lap Hoa Don: ");
         ngayrahd = in.next();
    System.out.println("So Luong(KW): ");
        soluong = in.nextInt();
    System.out.println("Don Gia: ");
        dongia = in.nextDouble();
}
    public String toString() {
        return "[makh: " + makh + ", hoten: " + hoten + ", ngayrahd: " + ngayrahd + ", dongia: " + dongia + ", soluong: " + soluong;
}

    void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



    

