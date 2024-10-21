import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 1;
        while(a != 0){
            s *= a%10;
            a /= 10;
        }
        System.out.println(s);
        sc.close();
    }
}