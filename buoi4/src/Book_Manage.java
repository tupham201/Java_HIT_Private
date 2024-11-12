import java.util.ArrayList;
import java.util.Scanner;

public class Book_Manage {
    static Scanner sc = new Scanner(System.in);

    public void addPerson(ArrayList<Person> Student){
        //sc.nextLine();
        System.out.println("Nhập mã cccd:");
        String id = sc.nextLine();
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập tuoi:");
        int old = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Địa chỉ:");
        String ad = sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        String phone = sc.nextLine();
        Student.add(new Person(id,name,old,ad,phone));
    }
    public void ShowPerson(ArrayList<Person> x){
        for(Person y : x){
            System.out.println(y.display());
        }
    }
    public void searchByName(String Ten, ArrayList<Person> student){
        for( Person x : student){
            if(x.getTen().equals(Ten)){
                System.out.println(x.display());
                return;
            }
        }
    }

    public void searchByMacccd(String id,ArrayList<Person> student){
        for( Person x : student){
            if(x.getMaCCCD().equals(id)){
                System.out.println(x.display());
                return;
            }
        }
    }
}
