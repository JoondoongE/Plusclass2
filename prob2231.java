package class2;
import java.util.*;

public class prob2231 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        // int size = String.valueOf(num).length();
        // int arr[] = new int[size];
        // int sum=0;

        // int result;

        // for(int i =0;i<size;i++){
        //     arr[i] = String.valueOf(num).charAt(i);
        //     sum +=arr[i];
        // }

        int size = num;
        int sum =0;

        while(num!=0){
            num--;
            int temp=num;
            int temp2=num;
            while(temp!=0){
                temp2 += temp%10;
                temp/=10;
            }
            if(temp2==size){sum=num;}
        }
        System.out.println(sum);
        sc.close();
    }
}
