package class2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class prob10828 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            //push
            if(s.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            //pop
            else if(s.equals("pop")){
                if(stack.empty()){System.out.println(-1);}
                else
                {System.out.println(stack.pop());}
            }
            //size
            else if(s.equals("size")){
                System.out.println(stack.size());
            }
            //empty
            else if(s.equals("empty")){
                if(stack.empty()){System.out.println(1);}
                else{System.out.println(0);}
            }
            //top
            else if(s.equals("top")){
                if(stack.empty()){System.out.println(-1);}
                else{System.out.println(stack.peek());}
            }
        }
    }
}
