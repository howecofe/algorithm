import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.readLine(); // N
		
		char[] arr = br.readLine().toCharArray();
		
		int sum = 0;
		for (char c : arr) {
			sum += c - '0';
		}
		
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
