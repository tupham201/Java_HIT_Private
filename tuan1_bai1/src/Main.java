import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int so = sc.nextInt();
        int he = sc.nextInt();
        String st = "0123456789ABCDEFGHIJKLLMNOPQRSTUVXYZW";
        StringBuilder st1 = new StringBuilder();
        while(so > 0){
            st1.insert(0, st.charAt(so % he));
            so /= he;
        }
        System.out.println(st1);
        sc.close();
    }
}