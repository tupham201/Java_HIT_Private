import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int kt = 0;
        for(int i = 0; i < st.length();i++){
            if((st.charAt(i) >= 'a' && st.charAt(i) <= 'z')||(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')){
                kt = 0;
                System.out.print(st.charAt(i));
            }
            else if(kt == 0){
                System.out.print(" ");
                kt =1;
            }
        }
        System.out.println();
        kt = 1;
        for(int i = 0; i < st.length();i++){
            if(st.charAt(i) >= '0' && st.charAt(i) <= '9'){
                kt = 0;
                System.out.print(st.charAt(i));
            }
            else if(kt == 0){
                System.out.print(" ");
                kt =1;
            }
        }
    }
}
