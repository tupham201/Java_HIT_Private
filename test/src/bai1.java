import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    static void Sp(int k){
        if(k == 1)System.out.print("Một");
        if(k == 2)System.out.print("Hai");
        if(k == 3)System.out.print("Ba");
        if(k == 4)System.out.print("Bốn");
        if(k == 5)System.out.print("Năm");
        if(k == 6)System.out.print("Sáu");
        if(k == 7)System.out.print("Bảy");
        if(k == 8)System.out.print("Tám");
        if(k == 9)System.out.print("Chín");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kt = 0;
        if(n > 100){
            int tg=  n/ 100;
            Sp(tg);
            System.out.print(" Trăm ");
            n %= 100;
            kt = 1;
        }
        if(kt == 0){
            if(n/10==1){
                System.out.print("Mười ");
                Sp(n%10);
            }
            return;
        }
        if(n > 10){
            int tg=  n/ 10;
            if(tg == 1){
                System.out.print("Mười ");
            }
            else{
                Sp(tg);
                System.out.print(" Mươi ");
            }
            if(tg < 2){
                n %= 10;
                Sp(n);
            }
            else{
                n %=10;
                if(n == 4){
                    System.out.print("Tư");
                }
                else Sp(n);
            }
        }
    }
}
