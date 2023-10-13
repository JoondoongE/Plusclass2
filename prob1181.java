package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class prob1181 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String []arr = new String[N];

        for(int i=0;i<N;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a1, String b1){
                if(a1.length()==b1.length()){
                    return a1.compareTo(b1);
                }
                else{
                    return a1.length()-b1.length();
                }
            }
        });

        System.out.println(arr[0]);
        for(int i=1;i<N;i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}
