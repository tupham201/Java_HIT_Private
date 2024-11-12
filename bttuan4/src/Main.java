
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        books.add(new Book(1, "1", "1", 1, "1", 1));
        books.add(new Book(2, "2", "2", 2, "2", 2));
        books.add(new Book(3, "3", "3", 3, "3", 3));

        System.out.println("Menu:");
        System.out.println("1. Thêm sách mới");
        System.out.println("2. Chỉnh sửa thông tin sách");
        System.out.println("3. In ra danh sách các cuốn sách");
        System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
        System.out.println("5. Thoát");
        System.out.print("Chọn chức năng: ");
        int choice = sc.nextInt();
        if(choice == 1)addNewBook(books, sc);
        if(choice == 2)editBook(books, sc);
        if(choice == 3)printBooks(books);
        if(choice == 4)printOldestBook(books);
        if(choice == 5)System.out.println("Kết thúc chương trình!");

    }

    public static void addNewBook(ArrayList<Book> books, Scanner sc) {
        System.out.print("Nhập mã sách: ");
        int maSach = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tóm tắt nội dung: ");
        String tomTatNoiDung = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        double giaTien = sc.nextDouble();

        books.add(new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien));
        System.out.println("Đã thêm sách mới thành công!");
        printBooks(books);
    }

    public static void editBook(ArrayList<Book> books, Scanner sc) {
        System.out.print("Nhập mã sách cần chỉnh sửa: ");
        int maSach = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {
            if (book.getMaSach() == maSach) {
                System.out.print("Nhập tên sách mới: ");
                book.setTenSach(sc.nextLine());
                System.out.print("Nhập tên tác giả mới: ");
                book.setTenTacGia(sc.nextLine());
                System.out.print("Nhập năm sản xuất mới: ");
                book.setNamSanXuat(sc.nextInt());
                sc.nextLine();
                System.out.print("Nhập tóm tắt nội dung mới: ");
                book.setTomTatNoiDung(sc.nextLine());
                System.out.print("Nhập giá tiền mới: ");
                book.setGiaTien(sc.nextDouble());

                System.out.println("Đã cập nhật thông tin sách thành công!");
                printBooks(books);
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã sách này.");
    }

    public static void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.display();
        }
    }

    public static void printOldestBook(ArrayList<Book> books) {
        Book oldestBook = books.get(0);
        for (Book book : books) {
            if (book.getNamSanXuat() < oldestBook.getNamSanXuat()) {
                oldestBook = book;
            }
        }
        System.out.println("Cuốn sách lâu đời cổ kính nhất là:");
        oldestBook.display();
    }
}