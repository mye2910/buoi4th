
package hoadon;



   public class khachhangvietnam extends Hoadon 
{
   private int LoaiKH, DinhMuc;
   public khachhangvietnam()
{
      super();
      this.LoaiKH=0;
      this.DinhMuc=0;
}
   public khachhangvietnamt( makh, double dongia, String ngay, String hoten, int sl, double ttien, int loai, int dm)
{
   super(ma, dgia, ngay, hoten, sl, ttien);
 
      this.LoaiKH = loai;
      this.DinhMuc = dm;
}
   public int getLoaiKH() {
      return LoaiKH;
}
   public void setLoaiKH(int loaiKH) {
      LoaiKH = loaiKH;
}
   public int getDinhMuc() {
      return DinhMuc;
}
   public void setDinhMuc(int dinhMuc) {
      DinhMuc = dinhMuc;
}
   public void nhap()
{
      super.nhap();
    System.out.println("Loai Khach Hang (1=SinhHoat, 2=KinhDoanh, 3=SanXuat)");
LoaiKH = in.nextInt();
System.out.println("Dinh Muc: ");
DinhMuc = in.nextInt();
}
public double TTien()
{
if(SoLuong<=DinhMuc)
return this.ThanhTien=this.DonGia*this.SoLuong;
else
return this.ThanhTien=this.DinhMuc*this.DonGia + (this.SoLuongthis.DinhMuc)*this.DonGia*2.5;
}
public String toString() 
{
String temp;
if(LoaiKH==1)
temp="Sinh Hoat";
else if(LoaiKH==2)
temp="Kinh Doanh";
else
temp="San Xuat";
return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp 
+ ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
}
}
public class KhachHangList 
{
 
private KhachHang kh[] = new KhachHang[100];
private int CountKH, sum1=0, sum2=0, dem=0, sumtien=0;
public KhachHangList()
{
CountKH=0;
for(int i=0; i<100; i++)
kh[i] = new KhachHang();
} 
}
