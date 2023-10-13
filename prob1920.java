package class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class prob1920 {
    public static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        //배열정렬
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<M;i++){
            if(search(Integer.parseInt(st.nextToken()))>=0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }


    public static int search(int key){
        int lo=0;
        int hi = arr.length -1;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            //key가 중간값보다 작을경우
            if(key<arr[mid]){
                hi = mid-1;
            }

            //key가 중간값보다 큰경우
            else if(key>arr[mid]){
                lo = mid+1;
            }

            else{
                return mid;
            }
        }
        return -1;
    }
}
