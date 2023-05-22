
package giaodich;


   public class giaodichnha extends Giaodich {
    private String loainha, diachi;
    private int choose;
     
    public giaodichnha() {
        super();
    }
 
    public giaodichnha(String loainha, String diachi) {
        super();
        this.loainha = loainha;
        this.diachi = diachi;
    }
 
    public String getloainha() {
        return loainha;
    }
 
    public void setloainha(String loainha) {
        this.loainha = loainha;
    }
 
    public String getdiachi() {
        return diachi;
    }
 
    public void setdiachi(String diachi) {
        this.diachi = diachi;
    } 
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("nhap dia chi: ");
        diachi = scanner.nextLine();
        System.out.print("nhap loai nha (0: cao cấp, 1: thường): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 0:
                loainha = "cao cap";
                break;
            case 1: 
                loainha = "thuong";
                break;
            default:
                System.out.println("ko hop le.");
                break;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", loại nhà: " + this.loainha + ", địa chỉ: " + this.diachi;
    }
}
