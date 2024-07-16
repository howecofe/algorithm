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
			
			// a~b 위치 요소 저장
			List<Integer> tmp = new ArrayList<>();
			for (int j = a; j <= b; j++) tmp.add(arr[j]);
			
			// 역순으로 할당
			int idx = tmp.size() - 1;
			for (int j = a; j <= b; j++) arr[j] = tmp.get(idx--);
		}
		
		// 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
		
		br.close();
	}

}
