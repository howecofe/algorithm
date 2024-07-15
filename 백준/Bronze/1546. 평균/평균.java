import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int N, sum;
	static double avg;
	static int max = -1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int score = Integer.parseInt(st.nextToken());
			sum += score;
			max = Math.max(max, score);
		}
		
		avg = (double)sum / max * 100 / N;
		
		bw.write(avg + "");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
