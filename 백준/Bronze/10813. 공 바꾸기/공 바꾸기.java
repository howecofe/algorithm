import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 풀이
		arr = new int[N + 1]; // 0: dummy
		for (int i = 1; i <= N; i++) arr[i] = i;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// swap
			int tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		// 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
		
		br.close();
	}

}
