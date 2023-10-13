package class2;
import java.util.*;
public class prob2798 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        int temp=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum = arr[i]+arr[j]+arr[k];
                    if(temp<sum && sum<m){
                        temp = sum;
                    }
                    if(m==sum){
                        System.out.println(sum);
                        return;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
