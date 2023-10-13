package class2;
import java.util.*;

public class prob2609 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        int a1 = a;
        int b1 = b;
        while(true){

            if(a>b){
                c = a%b;
                if(c==0){
                    System.out.println(b);
                    System.out.println(a1*b1/b);
                    break;
                }
                else{
                    a=b;
                    b=c;
                    c = a%b;
                }
            }
            else{
                c = b%a;
                if(c==0){
                    System.out.println(a);
                    System.out.println(a1*b1/a);
                    break;
                }
                else{
                    b=a;
                    a=c;
                    c = b%c;
                }
            }
            sc.close();
        }
    }
}
