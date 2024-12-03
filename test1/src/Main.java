import model.account;
import model.role;
import model.status;
import service.AccountService;
import service.impl.AccountServiceImpl;
import service.impl.AuthServiceImpl;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AuthServiceImpl authService = new AuthServiceImpl();
        AccountServiceImpl accountService = new AccountServiceImpl();
        Scanner sc = new Scanner(System.in);

        authService.login(sc);
        account curAcc = authService.GetCurr();

        while (curAcc != null) {
            System.out.println("\n========== Hệ thống quản lí tài khoản ==========");
            if (curAcc.getRole() == role.ADMIN) {
                System.out.println("Xin chào ADMIN: " + curAcc.getUsername());
                System.out.println("Chọn 1 trong các chức năng sau:");
                System.out.println("1. Xem danh sách tài khoản");
                System.out.println("2. Tạo tài khoản mới");
                System.out.println("3. Tìm kiếm tài khoản theo username");
                System.out.println("4. Xóa tài khoản");
                System.out.println("5. Thay đổi trạng thái tài khoản");
                System.out.println("6. Xem thông tin cá nhân");
                System.out.println("7. Đăng xuất");
                System.out.println("---------------------------------------------");
                System.out.println("Nhập lựa chọn của bạn: ");
            } else {
                System.out.println("\n========== Hệ thống người dùng ==========");
                System.out.println("Xin chào USER: " + curAcc.getUsername());
                System.out.println("Chọn 1 trong các chức năng sau:");
                System.out.println("1. Đổi mật khẩu");
                System.out.println("2. Xem thông tin cá nhân");
                System.out.println("3. Đăng xuất");
                System.out.println("---------------------------------------------");
                System.out.println("Nhập lựa chọn của bạn: ");
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (curAcc.getRole() == role.ADMIN) {
                        List<account> accounts = accountService.getAllAccount();
                        for (account account : accounts) {
                            System.out.println(account);
                        }
                    } else {
                        System.out.println("Enter old password: ");
                        String oldPassword = sc.nextLine();
                        System.out.println("Enter new password: ");
                        String newPassword = sc.nextLine();
                        authService.changePassword(curAcc.getUsername(), oldPassword, newPassword);
                    }
                    break;
                case 2:
                    if (curAcc.getRole() == role.ADMIN) {
                        System.out.println("Enter new username: ");
                        String newUsername = sc.nextLine();
                        System.out.println("Enter new password: ");
                        String newPassword = sc.nextLine();
                        System.out.println("Enter role (ADMIN/USER): ");
                        role roles = role.valueOf(sc.nextLine().toUpperCase());
                        account newAccount = new account(newUsername, newPassword, roles, status.ACTIVE);
                        accountService.createNewAccount(newAccount);
                    } else {
                        System.out.println(curAcc);
                    }
                    break;
                case 3:
                    if (curAcc.getRole() == role.ADMIN) {
                        System.out.println("Enter username to search: ");
                        String searchUsername = sc.nextLine();
                        account account = accountService.getAccountByUsername(searchUsername);
                        if (account != null) {
                            System.out.println(account);
                        }
                    }
                    break;
                case 4:
                    if (curAcc.getRole() == role.ADMIN) {
                        System.out.println("Enter username to delete: ");
                        String deleteUsername = sc.nextLine();
                        accountService.deleteAccount(deleteUsername);
                    }
                    break;
                case 5:
                    if (curAcc.getRole() == role.ADMIN) {
                        System.out.println("Enter username to change status: ");
                        String statusUsername = sc.nextLine();
                        System.out.println("Enter new status (ACTIVE/INACTIVE): ");
                        status statuss = status.valueOf(sc.nextLine().toUpperCase());
                        accountService.changeStatus(statusUsername, statuss);
                    }
                    break;
                case 6:
                    if (curAcc.getRole() == role.ADMIN) {
                        System.out.println(curAcc);
                    }
                    break;
                case 0:
                    authService.logout();
                    curAcc = null;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (curAcc == null) {
                authService.login(sc);
                curAcc = authService.GetCurr();
            }
        }
    }
}