package class2;
import java.util.*;

public class prob2292 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count =1; //겹 수
        int range =2; //범 위

        if(num==1){
            System.out.println(1);
        }

        else{
            while(range<=num){
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
