import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> Student = new ArrayList<>();

    public static void main(String[] args ){
        System.out.println("Nhập số lượng sách:");
        int n = sc.nextInt();
        Book_Manage x = new Book_Manage();
        for(int i=0;i<n;i++){
            x.addPerson(Student);
        }
        x.ShowPerson(Student);
        sc.nextLine();
        System.out.println("Nhập tên người cần tìm");
        String name1 = sc.nextLine();
        x.searchByName(name1,Student);
        System.out.println("Nhập số cc cần tìm: ");
        String id1 = sc.nextLine() ;
        x.searchByMacccd(id1,Student);
    }

}
