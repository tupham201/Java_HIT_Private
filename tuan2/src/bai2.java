import java.util.Scanner;

public class bai2 {
    static int n,k;
    static int[] a = new int[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        a[1] = sc.nextInt();
        for(int i = 2;i <= n ;i++)
        {
            a[i] = sc.nextInt();
            a[i] += a[i-1];
        }
        int maxx = Integer.MIN_VALUE;
        for(int i =1;i<=n;i++){
            for(int j = i + k-1; j <= n; j++){
                if(a[j]-a[i-1]>maxx)maxx = a[j]-a[i-1];
            }
        }
        System.out.println(maxx);
    }
}