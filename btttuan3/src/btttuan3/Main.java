package btttuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Mã sinh viên: ");
            String studentCode = sc.nextLine();

            System.out.print("Họ tên: ");
            String fullName = sc.nextLine();

            System.out.print("Tuổi: ");
            byte age = sc.nextByte();
            sc.nextLine();

            System.out.print("Số điện thoại: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Giới tính: ");
            String gender = sc.nextLine();

            students[i] = new Student(studentCode, fullName, age, phoneNumber, email, gender);
        }

        System.out.println(String.format("%-15s %-20s %-5s %-10s %-15s %-25s", "Student Code", "Full Name", "Age", "Gender", "Phone Number", "Email"));
        System.out.println("-------------------------------------------------------------------------------");

        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}