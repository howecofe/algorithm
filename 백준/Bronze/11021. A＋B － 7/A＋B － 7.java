import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int T;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i).append(": ").append(sum);
			bw.write(sb.toString() + "\n");
		
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
