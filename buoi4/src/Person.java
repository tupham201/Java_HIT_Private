import java.util.ArrayList;

public class Book {
    private String maCCCD;
    private String ten;
    private int tuoi;
    private String diachi;
    private String sdt;
    public Person(){}

    public Person(String maCCCD, String ten, int tuoi, String diachi, String sdt) {
        this.maCCCD = maCCCD;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public String display(){
        return "Mã căn cước công dân" + maCCCD + '\n' +
                "Tên" + ten + '\n'+
                "Tuổi" + tuoi + '\n'+
                "Địa chỉ" + diachi + '\n'+
                "Số điện thoại" + sdt + '\n';
    }

    public String getTen() {
        return ten;
    }

    public String getMaCCCD() {
        return maCCCD;
    }
}
