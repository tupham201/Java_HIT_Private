
public class Book {
    private int maSach;
    private String tenSach;
    private Author tenTacGia;
    private int namSanXuat;
    private String tomTatNoiDung;
    private double giaTien;

    public Book() {
    }

    public Book(int maSach, String tenSach, Author tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Author getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(Author tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ','+ tenTacGia + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", tomTatNoiDung='" + tomTatNoiDung + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}