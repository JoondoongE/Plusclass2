package class2;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class prob11866 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=N;i++){
            queue.add(i);
        }


        int cnt =0;
        while(!queue.isEmpty()){
            cnt++;
            int temp = queue.poll();
            if(cnt%K==0) list.add(temp);
            else queue.add(temp);
        }

        System.out.println(list.toString().replace("[", "<").replace("]", ">"));
        sc.close();
    }
}
