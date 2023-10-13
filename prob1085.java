package class2;
import java.util.*;

public class prob1085 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            sc.close();

            // int x_min = Math.min(x, w-x);
            // int y_min = Math.min(h, h-y);
            
            // System.out.println(Math.min(x_min, y_min));
            int l;

            if(x>w-x){l = w-x;}
            else{l=x;}

            int ll;
            if(y>h-y){ll=h-y;}
            else{ll=y;}

            if(l>ll){System.out.println(ll);}
            else{System.out.println(l);}
    }
}
