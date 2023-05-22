
package giaodich;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<giaodichnha> arrgiaodichnha = new ArrayList<>();
        ArrayList<giaodichdat> arrgiaodichdat = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập số giao dịch đất: ");
        soGiaoDichDat = scanner.nextInt();
        System.out.print("Nhập số giao dịch nhà: ");
        soGiaoDichNha = scanner.nextInt();
         
        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            giaodichdat giaodichdat = new giaodichdat();
            giaodichdat.nhap();
            arrgiaodichdat.add(giaodichdat);
        }
         
        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            giaodichnha giaodichnha = new giaodichnha();
            giaodichnha.nhap();
            arrgiaodichnha.add(giaodichnha);
        }
         
        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrgiaodichnha.size(); i++) {
            System.out.println(arrgiaodichdat.get(i).toString());
        }
         
        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrgiaodichnha.size(); i++) {
            System.out.println(arrgiaodichnha.get(i).toString());
        }
         
        for (int i = 0; i < arrgiaodichdat.size(); i++) {
            if (arrgiaodichdat.get(i).getloaidat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrgiaodichdat.get(i).getdientich() * 
                    arrgiaodichdat.get(i).getdongia() * 1.5;
            } else if (arrgiaodichdat.get(i).getloaidat().equalsIgnoreCase("B") || 
                    arrgiaodichdat.get(i).getloaidat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrgiaodichdat.get(i).getdientich() * 
                    arrgiaodichdat.get(i).getdongia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (arrgiaodichdat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
         
        // xuất ra các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for (int i = 0; i < arrgiaodichdat.size(); i++) {
            String[] dateGiaoDichDat = arrgiaodichdat.get(i).getngaygiaodich().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
                System.out.println(arrgiaodichdat.get(i).toString());
            }
        }
         
        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrgiaodichnha.size(); i++) {
            String[] dateGiaoDichNha = arrgiaodichnha.get(i).getngaygiaodich().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrgiaodichnha.get(i).toString());
            }
        }
    }
 
}

