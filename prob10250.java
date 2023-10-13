package class2;
import java.util.*;

public class prob10250 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int num[] = new int[t];
        int total = 0;
        for(int i =0;i<t;i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N%H == 0){
                W = H;
                total = (W*100) + (N/H);
            }
            else{
                W = N%H;
                total = (W*100) + ((N/H) +1);
            }

            num[i]=total;
        }

        for(int i =0;i<t;i++){
            System.out.println(num[i]);
        }

        sc.close();
    }
}
