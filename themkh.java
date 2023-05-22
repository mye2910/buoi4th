
package hoadon;


public class themkh {
   public void ThemKH(int temp)
{
if(CountKH>100)
System.out.println("Bo Nho Da Day, ko the them!");
else
{
if(temp==1)
{
kh[CountKH] = new KhachHangViet();
KhachHangViet khv = new KhachHangViet();
khv.nhap();
khv.ThanhTien = khv.TTien();
kh[CountKH]=khv;
sum1+=khv.SoLuong;
}
else
{
kh[CountKH] = new KhachHangNuocNgoai();
KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
khnn.nhap();
khnn.ThanhTien = khnn.TTien();
kh[CountKH] = khnn;
sum2 += khnn.SoLuong;
sumtien += khnn.ThanhTien;
dem++;
}
CountKH++;
}
}
public void HienThiKH()
{
for(int i=0; i<CountKH; i++)
{
System.out.println("\nSo TT: " + (i+1));
System.out.println(kh[i].toString());
}
}
public void TongSL()
{
System.out.println(":::->> Tong So Luong(KW) Dien cua KH Viet Nam: " + 
sum1);
System.out.println(":::->> Tong So Luong(KW) Dien cua KH Nuoc Ngoai: "
+ sum2);
 
Bài tập Môn: Lập trình hướng đối tượng - Trang 53
}
public void TrungBinh()
{
System.out.println("|-->> Trung Binh Thanh Tien cua KH Nuoc Ngoai: " + 
(sumtien/dem));
}
}
B5. Xây dựng lớp quản lý thông tin cho phép nhập xuất và tính trung bình thành tiền.
import java.util.Scanner;
public class KhachHang_CTQuanLy 
{
public static void main(String[] args) 
{
KhachHangList lkh = new KhachHangList();
Scanner in = new Scanner(System.in);
int x;
do
{
System.out.println("\n\t\t------------------------------------");
 System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
 System.out.println("\t\t|1. Them Khach Hang Viet\t\t\t |");
 System.out.println("\t\t|2. Them Khach Hang Nuoc Ngoai\t\t\t |");
 System.out.println("\t\t|3. Hien Thi Danh Sach Khach Hang\t\t |");
 System.out.println("\t\t|4. Xem Tong (KW)cua cac KH\t\t |");
 System.out.println("\t\t|5. Xem TB Thanh Tien cua KH NN\t |");
 System.out.println("\t\t--------------------------------------");
 x=in.nextInt();
 System.out.println("======>>");
 switch(x)
 {
 case 1:
 lkh.ThemKH(1);
 break;
 case 2:
 lkh.ThemKH(2);
 break;
 case 3:
 lkh.HienThiKH();
 break;
 case 4:
 lkh.TongSL();
 break;
 case 5:
 lkh.TrungBinh();
 break;
 }
}while(x!=0);
System.out.println("");
}
} 

