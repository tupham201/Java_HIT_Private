import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10000];
        int[] b = new int[100000];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        int maxx = 0;
        int vt = 0;
        for(int i = 0; i < n ;i++){
            if(b[a[i]] > maxx) {
                maxx = b[a[i]];
                vt = a[i];
            }
        }
        System.out.println(vt + " " + maxx);
    }
}