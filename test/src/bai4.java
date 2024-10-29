
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        a[0] = 0;
        a[1] = sc.nextInt();
        for(int i =2 ;i <= n ;i++){
            a[i] = sc.nextInt();
            a[i] += a[i-1];
        }
        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(a[r]- a[l-1]);
        }
    }
}
