package class2;

import java.io.*;
import java.util.Stack;

public class prob1874 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        int start = 0;

        while(n-->0){
            int value = Integer.parseInt(br.readLine());

            if(value>start){
                //start+1부터 입력받은 value까지 push
                for(int i=start+1;i<=value;i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value; //다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            else if(stack.peek()!=value){//top에 있는 원소가 입력받은 값과 같지않은 경우
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
