import java.util.Scanner;

public class Main {
    static int n,k;
    static int[] a = new int[10000];
    static Scanner sc = new Scanner(System.in);
    static void GetInPut(){
        n = sc.nextInt();
        k = sc.nextInt();
       for(int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
    }
    static void findd(int l , int r, int val){
        int mid = (l+r)/2;
        if(l == r){
            if(a[l] == val){
                System.out.println(l);
                return;
            }
            else {
                System.out.println(-1);
                return;
            }
        }
        if(a[mid] == val){
            System.out.println(mid);
            return;
        }
        //System.out.println(k);
        if(a[mid] > val)findd(l,mid,val);
        else findd(mid+1,r,val);
    }
    public static void main(String[] args) {
        GetInPut();
        findd(0,n-1, k);
    }
}