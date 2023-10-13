package class2;

import java.io.*;

public class prob1929 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        prime(a,b);
    }

    static void prime(int m, int n){
        int arr[] = new int[n+1];
        StringBuilder sb = new StringBuilder();

        for(int i=2;i<=n;i++){
            arr[i]=i;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==0)continue;
            for(int j=i+i;j<=n;j+=i){
                arr[j]=0;
            }
        }
        for(int i=m;i<=n;i++){
            if(arr[i]!=0)sb.append(i+"\n");
        }
        System.out.println(sb);
    }
}
