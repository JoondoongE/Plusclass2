package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prob10816 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //이진탐색하기전 배열정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<m;i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int [] arr, int key){
        int lo =0;
        int hi = arr.length;

        while(lo<hi){
            int mid = (lo+hi)/2; //중간위치
            if(key<=arr[mid]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }

    private static int upperBound(int[]arr, int key){
        int lo=0;
        int hi = arr.length;

        //lo가 hi랑 같아질 때까지 반복
        while(lo<hi){
            int mid = (lo+hi)/2;

            if(key<arr[mid]){
                hi =mid;
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
    }
}
