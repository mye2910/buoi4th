
package giaodich;


    public class giaodichdat extends Giaodich {
    private String loaidat;
 
    public giaodichdat() {
        super();
    }
 
    public giaodichdat(String loaidat) {
        super();
        this.loaidat = loaidat;
    }
    public String getloaidat() {
        return loaidat;
    }
 
    public void setloaidat(String loaidat) {
        this.loaidat = loaidat;
    }
     
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập loại đất (A/B/C): ");
        loaidat = scanner.nextLine();
    }
 
    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.loaidat;
    }
}

