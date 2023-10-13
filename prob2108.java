package class2;

import java.io.*;
import java.util.Arrays;

public class prob2108 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);

        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;
        for(int i=0;i<N;i++){
            int jump=0;
            int count=1;
            int i_value = arr[i];

            for(int j=i+1;j<N;j++){
                if(i_value != arr[j]){
                    break;
                }
                count++;
                jump++;
            }

            if(count> mode_max){
                mode_max = count;
                mode = i_value;
                flag = true;
            }
            else if(count==mode_max&&flag==true){
                mode = i_value;
                flag=false;
            }
            i+=jump;
        }

        StringBuilder sb = new StringBuilder();
        //      산술평균                             중앙값
        sb.append((int)Math.round((double)sum / N)).append('\n').append(arr[N/2]).append('\n').append(mode).append('\n').append(arr[N-1]-arr[0]);
        System.out.println(sb);
    }
}
