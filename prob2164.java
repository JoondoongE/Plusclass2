package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int que[] = new int[2*N];
        for(int i=1;i<=N;i++){
            que[i]=i;
        }

        int prev_index = 1;
        int last_index = N;

        while(N-- > 1){
            prev_index++;
            que[last_index+1] = que[prev_index];
            last_index++;
            prev_index++;
        }
        System.out.println(que[prev_index]);
    }
}
