package class2;

import java.util.*;
import java.io.*;

//브루트포스 알고리즘
public class prob1018 {
	public static boolean[][] arr;
	public static int min =64;
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		//체스판의 가로 세로 길이 입ㄹ겨 
		int N = Integer.parseInt(st.nextToken()); //세로
		int M = Integer.parseInt(st.nextToken()); //가로

		arr = new boolean[N][M];

		for(int i=0;i<N;i++){
			String str = br.readLine();

			for(int j=0;j<M;j++){
				if (str.charAt(j)=='W'){
					arr[i][j]=true;
				}
				else{
					arr[i][j]=false;
				}
			}
		}

		int N_row = N-7;
		int M_col = M-7;

		for(int i=0;i<N_row;i++){
			for(int j=0;j<M_col;j++){
				find(i,j);
			}
		}
		System.out.println(min);
    }

	public static void find(int x, int y){
			int end_x = x+8;
			int end_y = y+8;
			int count = 0;

			boolean TF = arr[x][y];
			for(int i=x;i<end_x;i++){
				for(int j=y;j<end_y;j++){

					if(arr[i][j]!=TF){
						count++;
					}

					TF = (!TF);
				}
				TF=(!TF);
			}
			count = Math.min(count,64-count);
			min = Math.min(min, count);
		}
}
