import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int max;
	static int[] pos = new int[2];
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 풀이
		max = -1;
		for (int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int n = Integer.parseInt(st.nextToken());
				
				if (max < n) {
					max = n;
					pos[0] = i;
					pos[1] = j;
				}
			}
		
		}
		
		// 출력
		System.out.println(max);
		System.out.println(pos[0] + " " + pos[1]);
				
		br.close();
	}

}
