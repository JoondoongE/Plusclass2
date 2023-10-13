package class2;

import java.io.*;

public class prob2839 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        //3과 5로
        if(n==1||n==2||n==4||n==7){
            System.out.println(-1);
        }
        else{
            switch(n%10){
                case 0:{
                    sum =  n/5;
                    System.out.println(sum);
                    break;
                }
                case 1:{
                    n= n-6;
                    sum  = n/5;
                    System.out.println(sum+2);
                    break;
                }
                case 2:{
                    n = n-12;
                    sum = n/5;
                    System.out.println(sum+4);
                    break;
                }
                case 3:{
                    n = n-3;
                    sum = n/5;
                    System.out.println(sum+1);
                    break;
                }
                case 4:{
                    n= n-9;
                    sum = n/5;
                    System.out.println(sum+3);
                    break;

                }
                case 5:{
                    System.out.println(n/5);
                    break;
                }
                case 6:{
                    n = n-6;
                    sum = n/5;
                    System.out.println(sum+2);
                    break;
                }
                case 7:{
                    n = n-12;
                    sum = n/5;
                    System.out.println(sum+4);
                    break;
                }
                case 8:{
                    n=n-3;
                    sum = n/5;
                    System.out.println(sum+1);
                    break;
                }
                case 9:{
                    n = n-9;
                    sum = n/5;
                    System.out.println(sum+3);
                    break;
                }
                default:{
                    System.out.println(n/5);
                    break;
                }
            }
        }
    }
}
