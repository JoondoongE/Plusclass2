package class2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob18111 {
    static int array[][];
    static int result[] = new int[2];
    static int time = Integer.MAX_VALUE;
    static int height;
    static int block;
    static int n,m,b;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        array = new int[n][m];

        int max=0;
       
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, array[i][j]);
            }
        }
        brute_force(max);
        System.out.println(time+" "+height);


    }

    static void brute_force(int max){
        //arr전체를 탐색해서 각 블럭의 갯수를 맞춰보며, 시간을 계산
        //각 시간의 최솟값으로 갱신
        for(int i=0;i<=max;i++){
            result = excavation(i);

            if(time>result[0]){
                time = result[0];
                height = result[1];
            }
            //시간이 같은 경우
            else if(time==result[0]&&height<result[1]){
                time = result[0];
                height = result[1];
            }
        }
    }

    //시간 높이 반환
    static int[] excavation(int height){
        int block =b;
        int time =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int value = array[i][j];

                //value기준으로 맞추려고 하는 높이(height)가 더 낮은 경우
                //블럭을 깍아야 하는경우
                if(value == height){continue;}
                if(value>height){
                    time+=(value-height)*2;
                    block+=(value-height);
                }
                //height가 더 높은 경우
                //블럭을 쌓아야하는 경우
                else{
                    time+=height-value;
                    block-=(height-value);
                }
            }
        }
        if(block<0){
            result[0]=999999999;
            return result;
        }
        result[0] = time;
        result[1] = height;
        return result;
    }
}
