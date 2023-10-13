package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1978 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int count =0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()){
            boolean isprime = true;
            int num = Integer.parseInt(st.nextToken());

            if(num==1){
                continue;
            }

            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){count++;}
        }


       
        System.out.println(count);
    }
}
