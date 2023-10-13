package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class prob10845 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int t=0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                t = Integer.parseInt(st.nextToken());
                q.add(t);
            }

            else if(s.equals("pop")){
                if(q.isEmpty()){System.out.println(-1);}
                else{System.out.println(q.poll());}
            }

            else if(s.equals("size")){
                System.out.println(q.size());
            }

            else if(s.equals("empty")){
                if(q.isEmpty()){System.out.println(1);}
                else{System.out.println(0);}
            }

            else if(s.equals("front")){
                if(q.isEmpty()){System.out.println(-1);}
                else{System.out.println(q.peek());}
            }

            else if(s.equals("back")){
                if(q.isEmpty()){System.out.println(-1);}
                else{System.out.println(t);}
            }
        }
    }
}
