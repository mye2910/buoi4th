
package giaodich;

import java.util.Scanner;


public class Giaodich {
    private String magiaodich, ngaygiaodich;
    private long dongia;
    private float dientich;
    Scanner scanner = new Scanner(System.in);
     
    public Giaodich() {
        super();
    }
 
    public Giaodich(String magiaodich, String ngaygiaodich, long dongia, float dientich) {
        super();
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }
    public String getmagiaodich() {
        return magiaodich;
    }
 
    public void setmagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }
 
    public String getngaygiaodich() {
        return ngaygiaodich;
    }
 
    public void setngaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }
 
    public long getdongia() {
        return dongia;
    }
 
    public void setdongia(long dongia) {
        this.dongia = dongia;
    }
 
    public float getdientich() {
        return dientich;
    }
 
    public void setdientich(float dientich) {
        this.dientich = dientich;
    }
    public void nhap(){
        System.out.print("nhap ma giao dich: ");
        magiaodich = scanner.nextLine();
        System.out.print("nhap ngay giao dich: ");
        ngaygiaodich = scanner.nextLine();
        System.out.print("nhap don gia: ");
        dongia = Long.parseLong(scanner.nextLine());
        System.out.print("nhap dien tich");
        dientich = Float.parseFloat(scanner.nextLine());
        }
    @Override
    public String toString() {
        return "Mã giao dịch: " + this.magiaodich + ", ngày giao dịch: " + this.ngaygiaodich + 
            ", đơn giá: " + this.dongia + ", diện tích: " + this.dientich;
    }
     }
    

