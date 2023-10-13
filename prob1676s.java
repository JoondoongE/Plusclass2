package class2;
import java.util.*;
public class prob1676s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=1;
        int cnt=0;


        for(int i=1;i<=n;i++){
            sum*=i;
        }
        String w = String.valueOf(sum);

        for(int i=w.length()-1;i>=0;i--){

            if(w.charAt(i) == '0'){
                cnt++;
            }
            else{break;}
        }

        System.out.println(cnt);
        sc.close();
    }
}
