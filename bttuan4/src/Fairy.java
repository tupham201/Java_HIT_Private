public class Fairy extends Book {
    private String Nvc;
    private String Nd;

    public Fairy() {
    }

    public Fairy(int maSach, String tenSach, Author tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien, String nvc, String nd) {
        super(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);
        Nvc = nvc;
        Nd = nd;
    }

    public String getNvc() {
        return Nvc;
    }

    public void setNvc(String nvc) {
        Nvc = nvc;
    }

    public String getNd() {
        return Nd;
    }

    public void setNd(String nd) {
        Nd = nd;
    }
    public String toString() {
        return "Nhân vật chính" + Nvc
                + ", Nội dung chính" + Nd;
    }
}
