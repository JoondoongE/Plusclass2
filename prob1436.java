package class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob1436 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count =1 ;
        int six =666;

        while(count!=n){
            six++;
            if(String.valueOf(six).contains("666")){
                count++;
            }
        }
        System.out.println(six);
    }
}
