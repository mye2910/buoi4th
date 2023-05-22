
package hoadon;


    public class khachhangnuocngoai extends Hoadon 
{
    private String quoctich;
    public khachhangnuocngoai()
{
    super();
    this.quoctich = quoctich;
}
 

    public khachhangnuocngoai(int makh, double dongia, String ngayrahd, String hoten, int soluong, double thanhtien, String quoctich)
{
     super(makh, dongia, ngayrahd, hoten, soluong, thanhtien);
         this.quoctich = quoctich;
}
    public String getquoctich() {
        return quoctich;
}
    public void setquocqich(String quoctich) {
        quoctich = quoctich;
}
    public void nhap()
{
        super.nhap();
    System.out.println("Quoc Tich: ");
        quoctich = in.next();
}
    public double thanhtien()
{
        return this.thanhtien = this.soluong*this.dongia;
}
    public String toString()
{
        return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + quoctich+ ", ThanhTien: " + thanhtien;
}
}

