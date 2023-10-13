package class2;

import java.io.*;

public class prob7568 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n]; //몸무게
        int brr[] = new int[n]; //키
        int total[] = new int[n]; //등수

        for(int i=0;i<n;i++){
            total[i]=1;
        }
        for(int i=0;i<n;i++){
            String []str = br.readLine().split(" ");
            arr[i] = Integer.parseInt(str[0]);  
            brr[i] = Integer.parseInt(str[1]);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]&&brr[i]<brr[j]){
                    total[i]++;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(total[i]+" ");
        }
    }
}
