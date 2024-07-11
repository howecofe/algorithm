import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i += 10) {
			int end = i + 10 > s.length() ? s.length() : i + 10;
			
			bw.write(s.substring(i, end) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
