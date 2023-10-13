package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class prob11650 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int [][] array = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2){
                if(s1[0]==s2[0]){
                    return s1[1]-s2[1];
                }
                else{
                    return s1[0]-s2[0];
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(array[i][0]+ " "+ array[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
